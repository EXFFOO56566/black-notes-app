package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

public final class dr1 implements fp1 {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f2304c = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final uu1 f2305a;

    /* renamed from: b  reason: collision with root package name */
    private final fp1 f2306b;

    public dr1(uu1 uu1, fp1 fp1) {
        this.f2305a = uu1;
        this.f2306b = fp1;
    }

    @Override // com.google.android.gms.internal.ads.fp1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] f = bq1.b(this.f2305a).f();
        byte[] a2 = this.f2306b.a(f, f2304c);
        byte[] a3 = ((fp1) bq1.a(this.f2305a.p(), f, fp1.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(a2.length + 4 + a3.length).putInt(a2.length).put(a2).put(a3).array();
    }
}
