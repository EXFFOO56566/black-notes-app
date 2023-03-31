package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;

final /* synthetic */ class vl implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f5129a;

    vl(wl wlVar, Activity activity) {
        this.f5129a = activity;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return wl.a(this.f5129a, view, windowInsets);
    }
}
