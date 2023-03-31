package com.google.android.gms.internal.ads;

public final class m21 implements y61<n21> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3647a;

    /* renamed from: b  reason: collision with root package name */
    private final zd1 f3648b;

    public m21(ko1 ko1, zd1 zd1) {
        this.f3647a = ko1;
        this.f3648b = zd1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<n21> a() {
        return this.f3647a.a(new p21(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ n21 b() {
        return new n21(this.f3648b.j);
    }
}
