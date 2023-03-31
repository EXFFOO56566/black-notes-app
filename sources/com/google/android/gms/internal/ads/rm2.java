package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import java.util.ArrayList;
import java.util.List;

public final class rm2 extends a {
    public static final Parcelable.Creator<rm2> CREATOR = new tm2();

    /* renamed from: b  reason: collision with root package name */
    public final int f4520b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final long f4521c;
    public final Bundle d;
    @Deprecated
    public final int e;
    public final List<String> f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final String j;
    public final br2 k;
    public final Location l;
    public final String m;
    public final Bundle n;
    public final Bundle o;
    public final List<String> p;
    public final String q;
    public final String r;
    @Deprecated
    public final boolean s;
    public final lm2 t;
    public final int u;
    public final String v;
    public final List<String> w;

    public rm2(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, br2 br2, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, lm2 lm2, int i5, String str5, List<String> list3) {
        this.f4520b = i2;
        this.f4521c = j2;
        this.d = bundle == null ? new Bundle() : bundle;
        this.e = i3;
        this.f = list;
        this.g = z;
        this.h = i4;
        this.i = z2;
        this.j = str;
        this.k = br2;
        this.l = location;
        this.m = str2;
        this.n = bundle2 == null ? new Bundle() : bundle2;
        this.o = bundle3;
        this.p = list2;
        this.q = str3;
        this.r = str4;
        this.s = z3;
        this.t = lm2;
        this.u = i5;
        this.v = str5;
        this.w = list3 == null ? new ArrayList<>() : list3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rm2)) {
            return false;
        }
        rm2 rm2 = (rm2) obj;
        return this.f4520b == rm2.f4520b && this.f4521c == rm2.f4521c && p.a(this.d, rm2.d) && this.e == rm2.e && p.a(this.f, rm2.f) && this.g == rm2.g && this.h == rm2.h && this.i == rm2.i && p.a(this.j, rm2.j) && p.a(this.k, rm2.k) && p.a(this.l, rm2.l) && p.a(this.m, rm2.m) && p.a(this.n, rm2.n) && p.a(this.o, rm2.o) && p.a(this.p, rm2.p) && p.a(this.q, rm2.q) && p.a(this.r, rm2.r) && this.s == rm2.s && this.u == rm2.u && p.a(this.v, rm2.v) && p.a(this.w, rm2.w);
    }

    public final int hashCode() {
        return p.a(Integer.valueOf(this.f4520b), Long.valueOf(this.f4521c), this.d, Integer.valueOf(this.e), this.f, Boolean.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i), this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, Boolean.valueOf(this.s), Integer.valueOf(this.u), this.v, this.w);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f4520b);
        c.a(parcel, 2, this.f4521c);
        c.a(parcel, 3, this.d, false);
        c.a(parcel, 4, this.e);
        c.b(parcel, 5, this.f, false);
        c.a(parcel, 6, this.g);
        c.a(parcel, 7, this.h);
        c.a(parcel, 8, this.i);
        c.a(parcel, 9, this.j, false);
        c.a(parcel, 10, (Parcelable) this.k, i2, false);
        c.a(parcel, 11, (Parcelable) this.l, i2, false);
        c.a(parcel, 12, this.m, false);
        c.a(parcel, 13, this.n, false);
        c.a(parcel, 14, this.o, false);
        c.b(parcel, 15, this.p, false);
        c.a(parcel, 16, this.q, false);
        c.a(parcel, 17, this.r, false);
        c.a(parcel, 18, this.s);
        c.a(parcel, 19, (Parcelable) this.t, i2, false);
        c.a(parcel, 20, this.u);
        c.a(parcel, 21, this.v, false);
        c.b(parcel, 22, this.w, false);
        c.a(parcel, a2);
    }
}
