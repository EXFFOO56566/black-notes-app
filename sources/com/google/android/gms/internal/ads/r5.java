package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class r5 extends a {
    public static final Parcelable.Creator<r5> CREATOR = new u5();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4446b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4447c;
    public final int d;
    public final byte[] e;
    public final String[] f;
    public final String[] g;
    public final boolean h;
    public final long i;

    r5(boolean z, String str, int i2, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.f4446b = z;
        this.f4447c = str;
        this.d = i2;
        this.e = bArr;
        this.f = strArr;
        this.g = strArr2;
        this.h = z2;
        this.i = j;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4446b);
        c.a(parcel, 2, this.f4447c, false);
        c.a(parcel, 3, this.d);
        c.a(parcel, 4, this.e, false);
        c.a(parcel, 5, this.f, false);
        c.a(parcel, 6, this.g, false);
        c.a(parcel, 7, this.h);
        c.a(parcel, 8, this.i);
        c.a(parcel, a2);
    }
}
