package com.google.android.gms.internal.ads;

final /* synthetic */ class hr implements xe2 {

    /* renamed from: a  reason: collision with root package name */
    private final xe2 f2967a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f2968b;

    hr(xe2 xe2, byte[] bArr) {
        this.f2967a = xe2;
        this.f2968b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.xe2
    public final ye2 a() {
        xe2 xe2 = this.f2967a;
        byte[] bArr = this.f2968b;
        return new mr(new ve2(bArr), bArr.length, xe2.a());
    }
}
