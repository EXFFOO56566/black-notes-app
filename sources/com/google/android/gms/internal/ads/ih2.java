package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class ih2 implements rh2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3090a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f3091b;

    ih2(jh2 jh2, Activity activity, Bundle bundle) {
        this.f3090a = activity;
        this.f3091b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f3090a, this.f3091b);
    }
}
