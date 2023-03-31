package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class ny1 implements f52 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3912a;

    ny1(mx1 mx1, Activity activity) {
        this.f3912a = activity;
    }

    @Override // com.google.android.gms.internal.ads.f52
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f3912a);
    }
}
