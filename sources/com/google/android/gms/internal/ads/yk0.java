package com.google.android.gms.internal.ads;

import android.graphics.Rect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class yk0 implements fh2 {

    /* renamed from: b  reason: collision with root package name */
    private final ws f5608b;

    yk0(ws wsVar) {
        this.f5608b = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        ju P = this.f5608b.P();
        Rect rect = hh2.d;
        P.a(rect.left, rect.top, false);
    }
}
