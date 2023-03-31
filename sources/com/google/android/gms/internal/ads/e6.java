package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class e6 extends a {
    public static final Parcelable.Creator<e6> CREATOR = new h6();

    /* renamed from: b  reason: collision with root package name */
    public final String f2371b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2372c;
    public final int d;
    public final String e;

    public e6(String str, boolean z, int i, String str2) {
        this.f2371b = str;
        this.f2372c = z;
        this.d = i;
        this.e = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f2371b, false);
        c.a(parcel, 2, this.f2372c);
        c.a(parcel, 3, this.d);
        c.a(parcel, 4, this.e, false);
        c.a(parcel, a2);
    }
}
