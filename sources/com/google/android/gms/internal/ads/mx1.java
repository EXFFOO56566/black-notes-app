package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class mx1 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final Application f3765b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f3766c;
    private boolean d = false;

    public mx1(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f3766c = new WeakReference<>(activityLifecycleCallbacks);
        this.f3765b = application;
    }

    private final void a(f52 f52) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f3766c.get();
            if (activityLifecycleCallbacks != null) {
                f52.a(activityLifecycleCallbacks);
            } else if (!this.d) {
                this.f3765b.unregisterActivityLifecycleCallbacks(this);
                this.d = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new kw1(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new p22(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new o12(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new ny1(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new r32(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new nz1(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new n02(this, activity));
    }
}
