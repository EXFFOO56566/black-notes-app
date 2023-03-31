package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class bg extends a {
    public static final Parcelable.Creator<bg> CREATOR = new eg();

    /* renamed from: b  reason: collision with root package name */
    String f1943b;

    public bg(String str) {
        this.f1943b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1943b, false);
        c.a(parcel, a2);
    }
}
