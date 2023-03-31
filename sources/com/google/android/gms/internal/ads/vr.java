package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

public final class vr extends sk {

    /* renamed from: c  reason: collision with root package name */
    final gq f5147c;
    final wr d;
    private final String e;
    private final String[] f;

    vr(gq gqVar, wr wrVar, String str, String[] strArr) {
        this.f5147c = gqVar;
        this.d = wrVar;
        this.e = str;
        this.f = strArr;
        q.y().a(this);
    }

    @Override // com.google.android.gms.internal.ads.sk
    public final void a() {
        try {
            this.d.a(this.e, this.f);
        } finally {
            gl.h.post(new ur(this));
        }
    }
}
