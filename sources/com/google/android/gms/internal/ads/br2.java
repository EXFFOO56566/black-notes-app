package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class br2 extends a {
    public static final Parcelable.Creator<br2> CREATOR = new dr2();

    /* renamed from: b  reason: collision with root package name */
    public final String f2001b;

    public br2(com.google.android.gms.ads.y.a aVar) {
        aVar.a();
        throw null;
    }

    br2(String str) {
        this.f2001b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 15, this.f2001b, false);
        c.a(parcel, a2);
    }
}
