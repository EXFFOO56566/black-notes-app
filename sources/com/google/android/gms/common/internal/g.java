package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import b.c.b.a.c.d;
import b.c.b.a.c.f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new h0();

    /* renamed from: b  reason: collision with root package name */
    private final int f1624b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1625c;
    private int d;
    String e;
    IBinder f;
    Scope[] g;
    Bundle h;
    Account i;
    d[] j;
    d[] k;
    private boolean l;
    private int m;

    public g(int i2) {
        this.f1624b = 4;
        this.d = f.f1163a;
        this.f1625c = i2;
        this.l = true;
    }

    g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z, int i5) {
        this.f1624b = i2;
        this.f1625c = i3;
        this.d = i4;
        if ("com.google.android.gms".equals(str)) {
            this.e = "com.google.android.gms";
        } else {
            this.e = str;
        }
        if (i2 < 2) {
            this.i = iBinder != null ? a.a(l.a.a(iBinder)) : null;
        } else {
            this.f = iBinder;
            this.i = account;
        }
        this.g = scopeArr;
        this.h = bundle;
        this.j = dVarArr;
        this.k = dVarArr2;
        this.l = z;
        this.m = i5;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f1624b);
        c.a(parcel, 2, this.f1625c);
        c.a(parcel, 3, this.d);
        c.a(parcel, 4, this.e, false);
        c.a(parcel, 5, this.f, false);
        c.a(parcel, 6, (Parcelable[]) this.g, i2, false);
        c.a(parcel, 7, this.h, false);
        c.a(parcel, 8, (Parcelable) this.i, i2, false);
        c.a(parcel, 10, (Parcelable[]) this.j, i2, false);
        c.a(parcel, 11, (Parcelable[]) this.k, i2, false);
        c.a(parcel, 12, this.l);
        c.a(parcel, 13, this.m);
        c.a(parcel, a2);
    }
}
