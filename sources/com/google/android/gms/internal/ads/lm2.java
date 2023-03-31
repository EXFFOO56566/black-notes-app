package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class lm2 extends a {
    public static final Parcelable.Creator<lm2> CREATOR = new km2();

    /* renamed from: b  reason: collision with root package name */
    public final String f3579b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3580c;

    public lm2(String str, String str2) {
        this.f3579b = str;
        this.f3580c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3579b, false);
        c.a(parcel, 2, this.f3580c, false);
        c.a(parcel, a2);
    }
}
