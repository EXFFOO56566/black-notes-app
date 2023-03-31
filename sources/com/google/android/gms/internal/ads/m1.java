package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.s.d;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class m1 extends a {
    public static final Parcelable.Creator<m1> CREATOR = new p1();

    /* renamed from: b  reason: collision with root package name */
    public final int f3638b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3639c;
    public final int d;
    public final boolean e;
    public final int f;
    public final er2 g;
    public final boolean h;
    public final int i;

    public m1(int i2, boolean z, int i3, boolean z2, int i4, er2 er2, boolean z3, int i5) {
        this.f3638b = i2;
        this.f3639c = z;
        this.d = i3;
        this.e = z2;
        this.f = i4;
        this.g = er2;
        this.h = z3;
        this.i = i5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public m1(d dVar) {
        this(4, dVar.f(), dVar.b(), dVar.e(), dVar.a(), dVar.d() != null ? new er2(dVar.d()) : null, dVar.g(), dVar.c());
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f3638b);
        c.a(parcel, 2, this.f3639c);
        c.a(parcel, 3, this.d);
        c.a(parcel, 4, this.e);
        c.a(parcel, 5, this.f);
        c.a(parcel, 6, (Parcelable) this.g, i2, false);
        c.a(parcel, 7, this.h);
        c.a(parcel, 8, this.i);
        c.a(parcel, a2);
    }
}
