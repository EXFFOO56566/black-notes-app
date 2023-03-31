package com.google.android.gms.internal.ads;

import android.view.View;

final class qu implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ vi f4391b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ pu f4392c;

    qu(pu puVar, vi viVar) {
        this.f4392c = puVar;
        this.f4391b = viVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f4392c.a((pu) view, (View) this.f4391b, (vi) 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
