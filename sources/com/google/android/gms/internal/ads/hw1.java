package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.interfaces.ECPublicKey;

public final class hw1 implements mp1 {
    private static final byte[] f = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    private final jw1 f2983a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2984b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f2985c;
    private final rw1 d;
    private final fw1 e;

    public hw1(ECPublicKey eCPublicKey, byte[] bArr, String str, rw1 rw1, fw1 fw1) {
        mw1.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f2983a = new jw1(eCPublicKey);
        this.f2985c = bArr;
        this.f2984b = str;
        this.d = rw1;
        this.e = fw1;
    }

    @Override // com.google.android.gms.internal.ads.mp1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        nw1 a2 = this.f2983a.a(this.f2984b, this.f2985c, bArr2, this.e.a(), this.d);
        byte[] a3 = this.e.a(a2.b()).a(bArr, f);
        byte[] a4 = a2.a();
        return ByteBuffer.allocate(a4.length + a3.length).put(a4).put(a3).array();
    }
}
