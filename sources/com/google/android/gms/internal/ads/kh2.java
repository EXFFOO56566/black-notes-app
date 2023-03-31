package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class kh2 implements rh2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3398a;

    kh2(jh2 jh2, Activity activity) {
        this.f3398a = activity;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f3398a);
    }
}
