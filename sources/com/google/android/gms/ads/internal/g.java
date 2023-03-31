package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new j();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1399b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1400c;
    private final String d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    g(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.f1399b = z;
        this.f1400c = z2;
        this.d = str;
        this.e = z3;
        this.f = f2;
        this.g = i2;
        this.h = z4;
        this.i = z5;
        this.j = z6;
    }

    public g(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(false, z2, null, false, 0.0f, -1, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f1399b);
        c.a(parcel, 3, this.f1400c);
        c.a(parcel, 4, this.d, false);
        c.a(parcel, 5, this.e);
        c.a(parcel, 6, this.f);
        c.a(parcel, 7, this.g);
        c.a(parcel, 8, this.h);
        c.a(parcel, 9, this.i);
        c.a(parcel, 10, this.j);
        c.a(parcel, a2);
    }
}
