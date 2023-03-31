package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class qw1 implements fp1 {

    /* renamed from: a  reason: collision with root package name */
    private final dx1 f4406a;

    /* renamed from: b  reason: collision with root package name */
    private final wp1 f4407b;

    public qw1(dx1 dx1, wp1 wp1, int i) {
        this.f4406a = dx1;
        this.f4407b = wp1;
    }

    @Override // com.google.android.gms.internal.ads.fp1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.f4406a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return cw1.a(a2, this.f4407b.a(cw1.a(bArr2, a2, copyOf)));
    }
}
