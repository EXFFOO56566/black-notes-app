package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.c;

public class a extends com.google.android.gms.common.internal.w.a {
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: b  reason: collision with root package name */
    private final int f1512b;

    /* renamed from: c  reason: collision with root package name */
    private int f1513c;
    private Bundle d;

    a(int i, int i2, Bundle bundle) {
        this.f1512b = i;
        this.f1513c = i2;
        this.d = bundle;
    }

    public int d() {
        return this.f1513c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1512b);
        c.a(parcel, 2, d());
        c.a(parcel, 3, this.d, false);
        c.a(parcel, a2);
    }
}
