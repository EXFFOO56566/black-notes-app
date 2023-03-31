package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class p22 implements f52 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4094a;

    p22(mx1 mx1, Activity activity) {
        this.f4094a = activity;
    }

    @Override // com.google.android.gms.internal.ads.f52
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f4094a);
    }
}
