package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class r32 implements f52 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f4440a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f4441b;

    r32(mx1 mx1, Activity activity, Bundle bundle) {
        this.f4440a = activity;
        this.f4441b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.f52
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f4440a, this.f4441b);
    }
}
