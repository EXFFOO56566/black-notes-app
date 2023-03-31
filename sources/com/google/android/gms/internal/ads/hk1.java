package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.Arrays;

public final class hk1 extends a {
    public static final Parcelable.Creator<hk1> CREATOR = new gk1();

    /* renamed from: b  reason: collision with root package name */
    private final int f2933b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f2934c;
    public final int d;

    hk1(int i, byte[] bArr, int i2) {
        this.f2933b = i;
        this.f2934c = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.d = i2;
    }

    public hk1(byte[] bArr, int i) {
        this(1, null, 1);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2933b);
        c.a(parcel, 2, this.f2934c, false);
        c.a(parcel, 3, this.d);
        c.a(parcel, a2);
    }
}
