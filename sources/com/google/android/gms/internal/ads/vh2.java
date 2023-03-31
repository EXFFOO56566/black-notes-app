package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
@TargetApi(14)
public final class vh2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private Activity f5118b;

    /* renamed from: c  reason: collision with root package name */
    private Context f5119c;
    private final Object d = new Object();
    private boolean e = true;
    private boolean f = false;
    @GuardedBy("lock")
    private final List<xh2> g = new ArrayList();
    @GuardedBy("lock")
    private final List<ji2> h = new ArrayList();
    private Runnable i;
    private boolean j = false;
    private long k;

    vh2() {
    }

    private final void a(Activity activity) {
        synchronized (this.d) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f5118b = activity;
            }
        }
    }

    public final Activity a() {
        return this.f5118b;
    }

    public final void a(Application application, Context context) {
        if (!this.j) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                a((Activity) context);
            }
            this.f5119c = application;
            this.k = ((Long) on2.e().a(zr2.o0)).longValue();
            this.j = true;
        }
    }

    public final void a(xh2 xh2) {
        synchronized (this.d) {
            this.g.add(xh2);
        }
    }

    public final Context b() {
        return this.f5119c;
    }

    public final void b(xh2 xh2) {
        synchronized (this.d) {
            this.g.remove(xh2);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.d) {
            if (this.f5118b != null) {
                if (this.f5118b.equals(activity)) {
                    this.f5118b = null;
                }
                Iterator<ji2> it = this.h.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().a(activity)) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        q.g().a(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        co.b(BuildConfig.FLAVOR, e2);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.d) {
            for (ji2 ji2 : this.h) {
                try {
                    ji2.onActivityPaused(activity);
                } catch (Exception e2) {
                    q.g().a(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    co.b(BuildConfig.FLAVOR, e2);
                }
            }
        }
        this.f = true;
        Runnable runnable = this.i;
        if (runnable != null) {
            gl.h.removeCallbacks(runnable);
        }
        sk1 sk1 = gl.h;
        uh2 uh2 = new uh2(this);
        this.i = uh2;
        sk1.postDelayed(uh2, this.k);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f = false;
        boolean z = !this.e;
        this.e = true;
        Runnable runnable = this.i;
        if (runnable != null) {
            gl.h.removeCallbacks(runnable);
        }
        synchronized (this.d) {
            for (ji2 ji2 : this.h) {
                try {
                    ji2.onActivityResumed(activity);
                } catch (Exception e2) {
                    q.g().a(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    co.b(BuildConfig.FLAVOR, e2);
                }
            }
            if (z) {
                for (xh2 xh2 : this.g) {
                    try {
                        xh2.a(true);
                    } catch (Exception e3) {
                        co.b(BuildConfig.FLAVOR, e3);
                    }
                }
            } else {
                co.a("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
