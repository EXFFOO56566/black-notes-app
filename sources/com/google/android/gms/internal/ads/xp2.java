package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class xp2 extends a {
    public static final Parcelable.Creator<xp2> CREATOR = new wp2();

    /* renamed from: b  reason: collision with root package name */
    private final int f5477b;

    public xp2(int i) {
        this.f5477b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f5477b);
        c.a(parcel, a2);
    }
}
