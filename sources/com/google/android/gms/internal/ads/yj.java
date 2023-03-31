package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class yj extends a {
    public static final Parcelable.Creator<yj> CREATOR = new ak();
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final String f5603b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5604c;
    @Deprecated
    public final um2 d;
    public final rm2 e;

    public yj(String str, String str2, um2 um2, rm2 rm2) {
        this.f5603b = str;
        this.f5604c = str2;
        this.d = um2;
        this.e = rm2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f5603b, false);
        c.a(parcel, 2, this.f5604c, false);
        c.a(parcel, 3, (Parcelable) this.d, i, false);
        c.a(parcel, 4, (Parcelable) this.e, i, false);
        c.a(parcel, a2);
    }
}
