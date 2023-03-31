package com.google.android.gms.internal.ads;

import android.content.Context;

final class sw implements ca1 {

    /* renamed from: a  reason: collision with root package name */
    private e52<Context> f4715a;

    /* renamed from: b  reason: collision with root package name */
    private e52<String> f4716b;

    /* renamed from: c  reason: collision with root package name */
    private e52<mb1<b00, h00>> f4717c;
    private e52<ea1> d;
    private e52<p91> e;
    private e52<w91> f;
    private final /* synthetic */ iw g;

    private sw(iw iwVar, Context context, String str) {
        this.g = iwVar;
        this.f4715a = v42.a(context);
        this.f4716b = v42.a(str);
        this.f4717c = new qb1(this.f4715a, this.g.Y, this.g.Z);
        this.d = t42.a(new la1(this.g.Y));
        this.e = t42.a(new x91(this.f4715a, this.g.d, this.g.y, this.f4717c, this.d, ae1.a()));
        this.f = t42.a(new da1(this.g.y, this.f4715a, this.f4716b, this.e, this.d, this.g.l));
    }

    @Override // com.google.android.gms.internal.ads.ca1
    public final w91 a() {
        return this.f.get();
    }
}
