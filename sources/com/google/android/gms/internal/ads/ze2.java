package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class ze2 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f5742a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f5743b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5744c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public ze2(Uri uri) {
        this(uri, 0);
    }

    private ze2(Uri uri, int i) {
        this(uri, 0, -1, null, 0);
    }

    private ze2(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public ze2(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private ze2(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, null, 0);
    }

    public ze2(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        mf2.a(j >= 0);
        mf2.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        mf2.a(z);
        this.f5742a = uri;
        this.f5743b = bArr;
        this.f5744c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    public final boolean a(int i) {
        return (this.g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5742a);
        String arrays = Arrays.toString(this.f5743b);
        long j = this.f5744c;
        long j2 = this.d;
        long j3 = this.e;
        String str = this.f;
        int i = this.g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
