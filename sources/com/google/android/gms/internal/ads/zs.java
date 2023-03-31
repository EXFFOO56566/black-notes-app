package com.google.android.gms.internal.ads;

import android.view.View;

final class zs implements View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ vi f5805b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vs f5806c;

    zs(vs vsVar, vi viVar) {
        this.f5806c = vsVar;
        this.f5805b = viVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f5806c.a((vs) view, (View) this.f5805b, (vi) 10);
    }

    public final void onViewDetachedFromWindow(View view) {
    }
}
