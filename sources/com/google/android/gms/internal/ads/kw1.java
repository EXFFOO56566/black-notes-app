package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

final class kw1 implements f52 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Activity f3460a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f3461b;

    kw1(mx1 mx1, Activity activity, Bundle bundle) {
        this.f3460a = activity;
        this.f3461b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.f52
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f3460a, this.f3461b);
    }
}
