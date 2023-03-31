package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.d;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class f0 extends a {
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* renamed from: b  reason: collision with root package name */
    Bundle f1622b;

    /* renamed from: c  reason: collision with root package name */
    d[] f1623c;
    private int d;

    public f0() {
    }

    f0(Bundle bundle, d[] dVarArr, int i) {
        this.f1622b = bundle;
        this.f1623c = dVarArr;
        this.d = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1622b, false);
        c.a(parcel, 2, (Parcelable[]) this.f1623c, i, false);
        c.a(parcel, 3, this.d);
        c.a(parcel, a2);
    }
}
