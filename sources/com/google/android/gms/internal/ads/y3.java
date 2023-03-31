package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.ArrayList;
import java.util.List;

public final class y3 extends h72 implements w3 {
    y3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final List H0() {
        Parcel a2 = a(23, r0());
        ArrayList b2 = i72.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void N1() {
        b(28, r0());
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void X() {
        b(22, r0());
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String a() {
        Parcel a2 = a(12, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(cp2 cp2) {
        Parcel r0 = r0();
        i72.a(r0, cp2);
        b(25, r0);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(lp2 lp2) {
        Parcel r0 = r0();
        i72.a(r0, lp2);
        b(32, r0);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(v3 v3Var) {
        Parcel r0 = r0();
        i72.a(r0, v3Var);
        b(21, r0);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(yo2 yo2) {
        Parcel r0 = r0();
        i72.a(r0, yo2);
        b(26, r0);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean a(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        Parcel a2 = a(16, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String b() {
        Parcel a2 = a(2, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(15, r0);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final u1 b0() {
        u1 u1Var;
        Parcel a2 = a(29, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            u1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            u1Var = queryLocalInterface instanceof u1 ? (u1) queryLocalInterface : new w1(readStrongBinder);
        }
        a2.recycle();
        return u1Var;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final a c() {
        Parcel a2 = a(19, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String d() {
        Parcel a2 = a(4, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void d(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(17, r0);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void destroy() {
        b(13, r0());
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final o1 e() {
        o1 o1Var;
        Parcel a2 = a(14, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            o1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            o1Var = queryLocalInterface instanceof o1 ? (o1) queryLocalInterface : new q1(readStrongBinder);
        }
        a2.recycle();
        return o1Var;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String f() {
        Parcel a2 = a(6, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final Bundle g() {
        Parcel a2 = a(20, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final rp2 getVideoController() {
        Parcel a2 = a(11, r0());
        rp2 a3 = qp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final List h() {
        Parcel a2 = a(3, r0());
        ArrayList b2 = i72.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void i0() {
        b(27, r0());
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final mp2 j() {
        Parcel a2 = a(31, r0());
        mp2 a3 = pp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final double k() {
        Parcel a2 = a(8, r0());
        double readDouble = a2.readDouble();
        a2.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final a n() {
        Parcel a2 = a(18, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean n0() {
        Parcel a2 = a(30, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String o() {
        Parcel a2 = a(10, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String q() {
        Parcel a2 = a(7, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String r() {
        Parcel a2 = a(9, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final v1 t() {
        v1 v1Var;
        Parcel a2 = a(5, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            v1Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            v1Var = queryLocalInterface instanceof v1 ? (v1) queryLocalInterface : new x1(readStrongBinder);
        }
        a2.recycle();
        return v1Var;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean v1() {
        Parcel a2 = a(24, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }
}
