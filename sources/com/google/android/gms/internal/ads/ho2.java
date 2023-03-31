package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class ho2 extends h72 implements eo2 {
    ho2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean D() {
        Parcel a2 = a(3, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String D1() {
        Parcel a2 = a(31, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void E1() {
        b(11, r0());
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final no2 S0() {
        no2 no2;
        Parcel a2 = a(32, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            no2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            no2 = queryLocalInterface instanceof no2 ? (no2) queryLocalInterface : new po2(readStrongBinder);
        }
        a2.recycle();
        return no2;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String V() {
        Parcel a2 = a(35, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final um2 Z1() {
        Parcel a2 = a(12, r0());
        um2 um2 = (um2) i72.a(a2, um2.CREATOR);
        a2.recycle();
        return um2;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final String a() {
        Parcel a2 = a(18, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(bn2 bn2) {
        Parcel r0 = r0();
        i72.a(r0, bn2);
        b(39, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(eh ehVar) {
        Parcel r0 = r0();
        i72.a(r0, ehVar);
        b(24, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(er2 er2) {
        Parcel r0 = r0();
        i72.a(r0, er2);
        b(29, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(io2 io2) {
        Parcel r0 = r0();
        i72.a(r0, io2);
        b(36, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(le leVar) {
        Parcel r0 = r0();
        i72.a(r0, leVar);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(lp2 lp2) {
        Parcel r0 = r0();
        i72.a(r0, lp2);
        b(42, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(no2 no2) {
        Parcel r0 = r0();
        i72.a(r0, no2);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(qn2 qn2) {
        Parcel r0 = r0();
        i72.a(r0, qn2);
        b(20, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(re reVar, String str) {
        Parcel r0 = r0();
        i72.a(r0, reVar);
        r0.writeString(str);
        b(15, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(rn2 rn2) {
        Parcel r0 = r0();
        i72.a(r0, rn2);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(ti2 ti2) {
        Parcel r0 = r0();
        i72.a(r0, ti2);
        b(40, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(u uVar) {
        Parcel r0 = r0();
        i72.a(r0, uVar);
        b(19, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(um2 um2) {
        Parcel r0 = r0();
        i72.a(r0, um2);
        b(13, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(xp2 xp2) {
        Parcel r0 = r0();
        i72.a(r0, xp2);
        b(30, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void a(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(34, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean a(rm2 rm2) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        Parcel a2 = a(4, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void b(to2 to2) {
        Parcel r0 = r0();
        i72.a(r0, to2);
        b(21, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(25, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void c(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(22, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void destroy() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rp2 getVideoController() {
        rp2 rp2;
        Parcel a2 = a(26, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            rp2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            rp2 = queryLocalInterface instanceof rp2 ? (rp2) queryLocalInterface : new tp2(readStrongBinder);
        }
        a2.recycle();
        return rp2;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final mp2 j() {
        mp2 mp2;
        Parcel a2 = a(41, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            mp2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            mp2 = queryLocalInterface instanceof mp2 ? (mp2) queryLocalInterface : new op2(readStrongBinder);
        }
        a2.recycle();
        return mp2;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final a m1() {
        Parcel a2 = a(1, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void p() {
        b(5, r0());
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void s(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(38, r0);
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void showInterstitial() {
        b(9, r0());
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final rn2 t1() {
        rn2 rn2;
        Parcel a2 = a(33, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            rn2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            rn2 = queryLocalInterface instanceof rn2 ? (rn2) queryLocalInterface : new tn2(readStrongBinder);
        }
        a2.recycle();
        return rn2;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final boolean u() {
        Parcel a2 = a(23, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final Bundle v() {
        Parcel a2 = a(37, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void x0() {
        b(10, r0());
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void z() {
        b(6, r0());
    }
}
