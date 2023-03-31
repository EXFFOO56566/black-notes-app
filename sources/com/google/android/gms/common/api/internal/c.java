package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final c f = new c();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f1554b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f1555c = new AtomicBoolean();
    @GuardedBy("sInstance")
    private final ArrayList<a> d = new ArrayList<>();
    @GuardedBy("sInstance")
    private boolean e = false;

    public interface a {
        void a(boolean z);
    }

    private c() {
    }

    public static void a(Application application) {
        synchronized (f) {
            if (!f.e) {
                application.registerActivityLifecycleCallbacks(f);
                application.registerComponentCallbacks(f);
                f.e = true;
            }
        }
    }

    public static c b() {
        return f;
    }

    private final void b(boolean z) {
        synchronized (f) {
            ArrayList<a> arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f) {
            this.d.add(aVar);
        }
    }

    public final boolean a() {
        return this.f1554b.get();
    }

    @TargetApi(16)
    public final boolean a(boolean z) {
        if (!this.f1555c.get()) {
            if (!l.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f1555c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f1554b.set(true);
            }
        }
        return a();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f1554b.compareAndSet(true, false);
        this.f1555c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f1554b.compareAndSet(true, false);
        this.f1555c.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f1554b.compareAndSet(false, true)) {
            this.f1555c.set(true);
            b(true);
        }
    }
}
