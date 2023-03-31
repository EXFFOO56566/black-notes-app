package com.google.android.gms.internal.ads;

import android.graphics.Rect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class oi0 implements fh2 {

    /* renamed from: b  reason: collision with root package name */
    private final ws f3999b;

    oi0(ws wsVar) {
        this.f3999b = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        ju P = this.f3999b.P();
        Rect rect = hh2.d;
        P.a(rect.left, rect.top, false);
    }
}
