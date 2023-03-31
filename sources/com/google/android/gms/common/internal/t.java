package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new e0();

    /* renamed from: b  reason: collision with root package name */
    private final int f1648b;

    /* renamed from: c  reason: collision with root package name */
    private IBinder f1649c;
    private b d;
    private boolean e;
    private boolean f;

    t(int i, IBinder iBinder, b bVar, boolean z, boolean z2) {
        this.f1648b = i;
        this.f1649c = iBinder;
        this.d = bVar;
        this.e = z;
        this.f = z2;
    }

    public l d() {
        return l.a.a(this.f1649c);
    }

    public b e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.d.equals(tVar.d) && d().equals(tVar.d());
    }

    public boolean g() {
        return this.e;
    }

    public boolean i() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1648b);
        c.a(parcel, 2, this.f1649c, false);
        c.a(parcel, 3, (Parcelable) e(), i, false);
        c.a(parcel, 4, g());
        c.a(parcel, 5, i());
        c.a(parcel, a2);
    }
}
