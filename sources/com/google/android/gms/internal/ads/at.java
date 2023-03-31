package com.google.android.gms.internal.ads;

import android.view.View;

/* access modifiers changed from: package-private */
public final class at implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f1811b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vi f1812c;
    private final /* synthetic */ int d;
    private final /* synthetic */ vs e;

    at(vs vsVar, View view, vi viVar, int i) {
        this.e = vsVar;
        this.f1811b = view;
        this.f1812c = viVar;
        this.d = i;
    }

    public final void run() {
        this.e.a((vs) this.f1811b, (View) this.f1812c, (vi) (this.d - 1));
    }
}
