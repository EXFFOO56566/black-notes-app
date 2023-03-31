package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.q;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class er2 extends a {
    public static final Parcelable.Creator<er2> CREATOR = new hr2();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2477b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2478c;
    public final boolean d;

    public er2(q qVar) {
        this(qVar.c(), qVar.b(), qVar.a());
    }

    public er2(boolean z, boolean z2, boolean z3) {
        this.f2477b = z;
        this.f2478c = z2;
        this.d = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f2477b);
        c.a(parcel, 3, this.f2478c);
        c.a(parcel, 4, this.d);
        c.a(parcel, a2);
    }
}
