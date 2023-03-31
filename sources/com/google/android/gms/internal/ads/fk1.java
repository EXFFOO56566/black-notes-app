package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class fk1 extends a {
    public static final Parcelable.Creator<fk1> CREATOR = new ek1();

    /* renamed from: b  reason: collision with root package name */
    private final int f2611b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2612c;
    private final String d;
    private final String e;
    private final int f;

    fk1(int i, int i2, int i3, String str, String str2) {
        this.f2611b = i;
        this.f2612c = i2;
        this.d = str;
        this.e = str2;
        this.f = i3;
    }

    public fk1(int i, a72 a72, String str, String str2) {
        this(1, i, a72.a(), str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2611b);
        c.a(parcel, 2, this.f2612c);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, 4, this.e, false);
        c.a(parcel, 5, this.f);
        c.a(parcel, a2);
    }
}
