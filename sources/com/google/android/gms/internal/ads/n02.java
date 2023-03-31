package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

final class n02 implements f52 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3779a;

    n02(mx1 mx1, Activity activity) {
        this.f3779a = activity;
    }

    @Override // com.google.android.gms.internal.ads.f52
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f3779a);
    }
}
