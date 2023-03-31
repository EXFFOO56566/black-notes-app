package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w.a;
import com.google.android.gms.common.internal.w.c;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class nf1 extends a {
    public static final Parcelable.Creator<nf1> CREATOR = new sf1();

    /* renamed from: b  reason: collision with root package name */
    private final qf1[] f3840b;

    /* renamed from: c  reason: collision with root package name */
    private final int[] f3841c;
    private final int[] d;
    @Nullable
    public final Context e;
    private final int f;
    public final qf1 g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    private final int l;
    public final int m;
    private final int n;
    private final int o;

    public nf1(int i2, int i3, int i4, int i5, String str, int i6, int i7) {
        this.f3840b = qf1.values();
        this.f3841c = pf1.a();
        int[] b2 = pf1.b();
        this.d = b2;
        this.e = null;
        this.f = i2;
        this.g = this.f3840b[i2];
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = str;
        this.l = i6;
        this.m = this.f3841c[i6];
        this.n = i7;
        this.o = b2[i7];
    }

    private nf1(@Nullable Context context, qf1 qf1, int i2, int i3, int i4, String str, String str2, String str3) {
        this.f3840b = qf1.values();
        this.f3841c = pf1.a();
        this.d = pf1.b();
        this.e = context;
        this.f = qf1.ordinal();
        this.g = qf1;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = str;
        int i5 = "oldest".equals(str2) ? pf1.f4162a : ("lru".equals(str2) || !"lfu".equals(str2)) ? pf1.f4163b : pf1.f4164c;
        this.m = i5;
        this.l = i5 - 1;
        "onAdClosed".equals(str3);
        int i6 = pf1.e;
        this.o = i6;
        this.n = i6 - 1;
    }

    public static nf1 a(qf1 qf1, Context context) {
        if (qf1 == qf1.Rewarded) {
            return new nf1(context, qf1, ((Integer) on2.e().a(zr2.g3)).intValue(), ((Integer) on2.e().a(zr2.m3)).intValue(), ((Integer) on2.e().a(zr2.o3)).intValue(), (String) on2.e().a(zr2.q3), (String) on2.e().a(zr2.i3), (String) on2.e().a(zr2.k3));
        } else if (qf1 == qf1.Interstitial) {
            return new nf1(context, qf1, ((Integer) on2.e().a(zr2.h3)).intValue(), ((Integer) on2.e().a(zr2.n3)).intValue(), ((Integer) on2.e().a(zr2.p3)).intValue(), (String) on2.e().a(zr2.r3), (String) on2.e().a(zr2.j3), (String) on2.e().a(zr2.l3));
        } else if (qf1 != qf1.AppOpen) {
            return null;
        } else {
            return new nf1(context, qf1, ((Integer) on2.e().a(zr2.u3)).intValue(), ((Integer) on2.e().a(zr2.w3)).intValue(), ((Integer) on2.e().a(zr2.x3)).intValue(), (String) on2.e().a(zr2.s3), (String) on2.e().a(zr2.t3), (String) on2.e().a(zr2.v3));
        }
    }

    public static boolean d() {
        return ((Boolean) on2.e().a(zr2.f3)).booleanValue();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f);
        c.a(parcel, 2, this.h);
        c.a(parcel, 3, this.i);
        c.a(parcel, 4, this.j);
        c.a(parcel, 5, this.k, false);
        c.a(parcel, 6, this.l);
        c.a(parcel, 7, this.n);
        c.a(parcel, a2);
    }
}
