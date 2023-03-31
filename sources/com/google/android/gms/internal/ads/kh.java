package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class kh extends a {
    public static final Parcelable.Creator<kh> CREATOR = new nh();

    /* renamed from: b  reason: collision with root package name */
    public final rm2 f3390b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3391c;

    public kh(rm2 rm2, String str) {
        this.f3390b = rm2;
        this.f3391c = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f3390b, i, false);
        c.a(parcel, 3, this.f3391c, false);
        c.a(parcel, a2);
    }
}
