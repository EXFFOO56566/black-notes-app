package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.ArrayList;
import java.util.List;

public final class q2 extends h72 implements o2 {
    q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String a() {
        Parcel a2 = a(17, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean a(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        Parcel a2 = a(13, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String b() {
        Parcel a2 = a(3, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void b(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(12, r0);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final a c() {
        Parcel a2 = a(16, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String d() {
        Parcel a2 = a(5, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void d(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final v1 d0() {
        v1 v1Var;
        Parcel a2 = a(6, r0());
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

    @Override // com.google.android.gms.internal.ads.o2
    public final void destroy() {
        b(10, r0());
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final o1 e() {
        o1 o1Var;
        Parcel a2 = a(15, r0());
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

    @Override // com.google.android.gms.internal.ads.o2
    public final String f() {
        Parcel a2 = a(7, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final Bundle g() {
        Parcel a2 = a(9, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final rp2 getVideoController() {
        Parcel a2 = a(11, r0());
        rp2 a3 = qp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final List h() {
        Parcel a2 = a(4, r0());
        ArrayList b2 = i72.b(a2);
        a2.recycle();
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final a n() {
        Parcel a2 = a(2, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String q() {
        Parcel a2 = a(8, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
