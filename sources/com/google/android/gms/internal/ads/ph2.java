package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class ph2 implements rh2 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4179a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4180b;

    ph2(jh2 jh2, Activity activity, Bundle bundle) {
        this.f4179a = activity;
        this.f4180b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f4179a, this.f4180b);
    }
}
