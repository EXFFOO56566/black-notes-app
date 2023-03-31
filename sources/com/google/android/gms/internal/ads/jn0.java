package com.google.android.gms.internal.ads;

public final class jn0 implements a60, l70, m80 {

    /* renamed from: b  reason: collision with root package name */
    private final rn0 f3252b;

    /* renamed from: c  reason: collision with root package name */
    private final zn0 f3253c;

    public jn0(rn0 rn0, zn0 zn0) {
        this.f3252b = rn0;
        this.f3253c = zn0;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i) {
        this.f3252b.a().put("action", "ftl");
        this.f3252b.a().put("ftl", String.valueOf(i));
        this.f3253c.a(this.f3252b.a());
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(vd1 vd1) {
        this.f3252b.a(vd1);
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(zf zfVar) {
        this.f3252b.a(zfVar.f5745b);
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        this.f3252b.a().put("action", "loaded");
        this.f3253c.a(this.f3252b.a());
    }
}
