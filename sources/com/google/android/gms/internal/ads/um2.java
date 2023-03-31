package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.a0;
import com.google.android.gms.ads.e;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;

public final class um2 extends a {
    public static final Parcelable.Creator<um2> CREATOR = new xm2();

    /* renamed from: b  reason: collision with root package name */
    public final String f4976b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4977c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final um2[] h;
    public final boolean i;
    public final boolean j;
    public boolean k;
    public boolean l;
    private boolean m;
    public boolean n;
    public boolean o;

    public um2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public um2(Context context, e eVar) {
        this(context, new e[]{eVar});
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public um2(android.content.Context r13, com.google.android.gms.ads.e[] r14) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.um2.<init>(android.content.Context, com.google.android.gms.ads.e[]):void");
    }

    um2(String str, int i2, int i3, boolean z, int i4, int i5, um2[] um2Arr, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f4976b = str;
        this.f4977c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = i5;
        this.h = um2Arr;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = z8;
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public static um2 e() {
        return new um2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false);
    }

    public static um2 g() {
        return new um2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false);
    }

    public static um2 i() {
        return new um2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false);
    }

    public static um2 j() {
        return new um2("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false);
    }

    public final e d() {
        return a0.a(this.f, this.f4977c, this.f4976b);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 2, this.f4976b, false);
        c.a(parcel, 3, this.f4977c);
        c.a(parcel, 4, this.d);
        c.a(parcel, 5, this.e);
        c.a(parcel, 6, this.f);
        c.a(parcel, 7, this.g);
        c.a(parcel, 8, (Parcelable[]) this.h, i2, false);
        c.a(parcel, 9, this.i);
        c.a(parcel, 10, this.j);
        c.a(parcel, 11, this.k);
        c.a(parcel, 12, this.l);
        c.a(parcel, 13, this.m);
        c.a(parcel, 14, this.n);
        c.a(parcel, 15, this.o);
        c.a(parcel, a2);
    }
}
