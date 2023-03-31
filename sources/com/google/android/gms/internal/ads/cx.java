package com.google.android.gms.internal.ads;

import android.content.Context;

final class cx implements ad1 {

    /* renamed from: a  reason: collision with root package name */
    private e52<Context> f2176a;

    /* renamed from: b  reason: collision with root package name */
    private e52<mb1<fk0, ck0>> f2177b;

    /* renamed from: c  reason: collision with root package name */
    private e52<rb1> f2178c;
    private e52<td1> d;
    private e52<pc1> e;
    private e52<cd1> f;
    private e52<String> g;
    private e52<wc1> h;
    private final /* synthetic */ iw i;

    private cx(iw iwVar, Context context, String str) {
        this.i = iwVar;
        r42 a2 = v42.a(context);
        this.f2176a = a2;
        this.f2177b = new pb1(a2, this.i.Y, this.i.Z);
        this.f2178c = t42.a(new nc1(this.i.Y));
        this.d = t42.a(xd1.a());
        e52<pc1> a3 = t42.a(new sc1(this.f2176a, this.i.d, this.i.y, this.f2177b, this.f2178c, ae1.a(), this.d));
        this.e = a3;
        this.f = t42.a(new dd1(a3, this.f2178c, this.d));
        r42 b2 = v42.b(str);
        this.g = b2;
        this.h = t42.a(new xc1(b2, this.e, this.f2176a, this.f2178c, this.d));
    }

    @Override // com.google.android.gms.internal.ads.ad1
    public final cd1 a() {
        return this.f.get();
    }

    @Override // com.google.android.gms.internal.ads.ad1
    public final wc1 b() {
        return this.h.get();
    }
}
