package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class mh2 implements rh2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3711a;

    mh2(jh2 jh2, Activity activity) {
        this.f3711a = activity;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f3711a);
    }
}
