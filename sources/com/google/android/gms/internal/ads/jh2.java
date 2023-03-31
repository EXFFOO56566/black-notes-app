package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class jh2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private final Application f3229b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f3230c;
    private boolean d = false;

    public jh2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f3230c = new WeakReference<>(activityLifecycleCallbacks);
        this.f3229b = application;
    }

    private final void a(rh2 rh2) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f3230c.get();
            if (activityLifecycleCallbacks != null) {
                rh2.a(activityLifecycleCallbacks);
            } else if (!this.d) {
                this.f3229b.unregisterActivityLifecycleCallbacks(this);
                this.d = true;
            }
        } catch (Exception e) {
            co.b("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new ih2(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new oh2(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new nh2(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new kh2(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new ph2(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new lh2(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new mh2(this, activity));
    }
}
