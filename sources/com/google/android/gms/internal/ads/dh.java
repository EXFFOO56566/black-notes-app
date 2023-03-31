package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class dh extends h72 implements bh {
    dh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void M(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(11, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final boolean M() {
        Parcel a2 = a(5, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void P() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final boolean S1() {
        Parcel a2 = a(20, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final String a() {
        Parcel a2 = a(12, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(eh ehVar) {
        Parcel r0 = r0();
        i72.a(r0, ehVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(io2 io2) {
        Parcel r0 = r0();
        i72.a(r0, io2);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(kh khVar) {
        Parcel r0 = r0();
        i72.a(r0, khVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(zg zgVar) {
        Parcel r0 = r0();
        i72.a(r0, zgVar);
        b(16, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void a(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(34, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void c(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(13, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void destroy() {
        b(8, r0());
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final mp2 j() {
        Parcel a2 = a(21, r0());
        mp2 a3 = pp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void k(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(17, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void l(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void p() {
        b(6, r0());
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void p(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(18, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void r(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(9, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final Bundle v() {
        Parcel a2 = a(15, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void v(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(19, r0);
    }

    @Override // com.google.android.gms.internal.ads.bh
    public final void z() {
        b(7, r0());
    }
}
