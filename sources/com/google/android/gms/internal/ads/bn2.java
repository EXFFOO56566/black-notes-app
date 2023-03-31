package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class bn2 extends a {
    public static final Parcelable.Creator<bn2> CREATOR = new an2();

    /* renamed from: b  reason: collision with root package name */
    public final int f1980b;

    public bn2(int i) {
        this.f1980b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1980b);
        c.a(parcel, a2);
    }
}
