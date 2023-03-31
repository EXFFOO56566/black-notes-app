package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

public final class ve2 implements ye2 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f5102a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f5103b;

    /* renamed from: c  reason: collision with root package name */
    private int f5104c;
    private int d;

    public ve2(byte[] bArr) {
        mf2.a(bArr);
        mf2.a(bArr.length > 0);
        this.f5102a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f5102a, this.f5104c, bArr, i, min);
        this.f5104c += min;
        this.d -= min;
        return min;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final long a(ze2 ze2) {
        this.f5103b = ze2.f5742a;
        long j = ze2.d;
        this.f5104c = (int) j;
        long j2 = ze2.e;
        if (j2 == -1) {
            j2 = ((long) this.f5102a.length) - j;
        }
        int i = (int) j2;
        this.d = i;
        if (i > 0 && this.f5104c + i <= this.f5102a.length) {
            return (long) i;
        }
        int i2 = this.f5104c;
        long j3 = ze2.e;
        int length = this.f5102a.length;
        StringBuilder sb = new StringBuilder(77);
        sb.append("Unsatisfiable range: [");
        sb.append(i2);
        sb.append(", ");
        sb.append(j3);
        sb.append("], length: ");
        sb.append(length);
        throw new IOException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final void close() {
        this.f5103b = null;
    }

    @Override // com.google.android.gms.internal.ads.ye2
    public final Uri l0() {
        return this.f5103b;
    }
}
