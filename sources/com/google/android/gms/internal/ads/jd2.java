package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class jd2 implements md2, nd2 {

    /* renamed from: b  reason: collision with root package name */
    private final Uri f3207b;

    /* renamed from: c  reason: collision with root package name */
    private final xe2 f3208c;
    private final oa2 d;
    private final int e;
    private final sk1 f;
    private final id2 g;
    private final q82 h = new q82();
    private final int i;
    private md2 j;
    private o82 k;
    private boolean l;

    public jd2(Uri uri, xe2 xe2, oa2 oa2, int i2, sk1 sk1, id2 id2, String str, int i3) {
        this.f3207b = uri;
        this.f3208c = xe2;
        this.d = oa2;
        this.e = i2;
        this.f = sk1;
        this.g = id2;
        this.i = i3;
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final ld2 a(int i2, we2 we2) {
        mf2.a(i2 == 0);
        return new ad2(this.f3207b, this.f3208c.a(), this.d.a(), this.e, this.f, this.g, this, we2, null, this.i);
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void a(ld2 ld2) {
        ((ad2) ld2).g();
    }

    @Override // com.google.android.gms.internal.ads.md2
    public final void a(o82 o82, Object obj) {
        boolean z = false;
        if (o82.a(0, this.h, false).f4290c != -9223372036854775807L) {
            z = true;
        }
        if (!this.l || z) {
            this.k = o82;
            this.l = z;
            this.j.a(o82, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void a(r72 r72, boolean z, md2 md2) {
        this.j = md2;
        be2 be2 = new be2(-9223372036854775807L, false);
        this.k = be2;
        md2.a(be2, null);
    }

    @Override // com.google.android.gms.internal.ads.nd2
    public final void b() {
        this.j = null;
    }
}
