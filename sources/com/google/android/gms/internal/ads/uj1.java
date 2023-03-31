package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class uj1 extends a {
    public static final Parcelable.Creator<uj1> CREATOR = new tj1();

    /* renamed from: b  reason: collision with root package name */
    private final int f4965b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4966c;
    private final String d;

    uj1(int i, String str, String str2) {
        this.f4965b = i;
        this.f4966c = str;
        this.d = str2;
    }

    public uj1(String str, String str2) {
        this(1, str, str2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4965b);
        c.a(parcel, 2, this.f4966c, false);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, a2);
    }
}
