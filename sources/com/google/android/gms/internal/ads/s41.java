package com.google.android.gms.internal.ads;

public final class s41 implements y61<t41> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f4598a;

    /* renamed from: b  reason: collision with root package name */
    private final gd1 f4599b;

    public s41(ko1 ko1, gd1 gd1) {
        this.f4598a = ko1;
        this.f4599b = gd1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<t41> a() {
        return this.f4598a.a(new v41(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ t41 b() {
        return new t41(this.f4599b);
    }
}
