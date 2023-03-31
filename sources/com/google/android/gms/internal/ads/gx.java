package com.google.android.gms.internal.ads;

final class gx implements l01 {

    /* renamed from: a  reason: collision with root package name */
    private g50 f2822a;

    /* renamed from: b  reason: collision with root package name */
    private b11 f2823b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ iw f2824c;

    private gx(iw iwVar) {
        this.f2824c = iwVar;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final /* synthetic */ l01 a(b11 b11) {
        y42.a(b11);
        this.f2823b = b11;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final /* synthetic */ l01 a(g50 g50) {
        y42.a(g50);
        this.f2822a = g50;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l01
    @Deprecated
    public final /* synthetic */ l01 a(k90 k90) {
        y42.a(k90);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.l01
    public final m01 a() {
        y42.a(this.f2822a, g50.class);
        y42.a(this.f2823b, b11.class);
        return new jx(this.f2824c, this.f2823b, new s30(), new io0(), this.f2822a, new af1());
    }
}
