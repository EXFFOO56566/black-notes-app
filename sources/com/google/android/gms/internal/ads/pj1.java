package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class pj1 extends a {
    public static final Parcelable.Creator<pj1> CREATOR = new sj1();

    /* renamed from: b  reason: collision with root package name */
    private final int f4188b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f4189c;

    pj1(int i, byte[] bArr) {
        this.f4188b = i;
        this.f4189c = bArr;
    }

    public pj1(byte[] bArr) {
        this(1, bArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4188b);
        c.a(parcel, 2, this.f4189c, false);
        c.a(parcel, a2);
    }
}
