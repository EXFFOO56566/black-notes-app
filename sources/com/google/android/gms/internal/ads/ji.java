package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class ji extends a {
    public static final Parcelable.Creator<ji> CREATOR = new ii();

    /* renamed from: b  reason: collision with root package name */
    public final String f3231b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3232c;

    public ji(String str, String str2) {
        this.f3231b = str;
        this.f3232c = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3231b, false);
        c.a(parcel, 2, this.f3232c, false);
        c.a(parcel, a2);
    }
}
