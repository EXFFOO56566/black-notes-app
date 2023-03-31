package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class q6 extends a {
    public static final Parcelable.Creator<q6> CREATOR = new t6();

    /* renamed from: b  reason: collision with root package name */
    public final int f4278b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4279c;
    public final String d;
    public final int e;

    public q6(int i, int i2, String str, int i3) {
        this.f4278b = i;
        this.f4279c = i2;
        this.d = str;
        this.e = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4279c);
        c.a(parcel, 2, this.d, false);
        c.a(parcel, 3, this.e);
        c.a(parcel, 1000, this.f4278b);
        c.a(parcel, a2);
    }
}
