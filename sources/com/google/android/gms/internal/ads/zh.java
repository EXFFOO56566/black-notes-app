package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class zh extends h72 implements xh {
    zh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final wh I0() {
        wh whVar;
        Parcel a2 = a(11, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            whVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            whVar = queryLocalInterface instanceof wh ? (wh) queryLocalInterface : new yh(readStrongBinder);
        }
        a2.recycle();
        return whVar;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final boolean M() {
        Parcel a2 = a(3, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final String a() {
        Parcel a2 = a(4, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(a aVar, boolean z) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, z);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(bi biVar) {
        Parcel r0 = r0();
        i72.a(r0, biVar);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(gi giVar) {
        Parcel r0 = r0();
        i72.a(r0, giVar);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(gp2 gp2) {
        Parcel r0 = r0();
        i72.a(r0, gp2);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(ji jiVar) {
        Parcel r0 = r0();
        i72.a(r0, jiVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(lp2 lp2) {
        Parcel r0 = r0();
        i72.a(r0, lp2);
        b(13, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void a(rm2 rm2, di diVar) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        i72.a(r0, diVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void b(rm2 rm2, di diVar) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        i72.a(r0, diVar);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final mp2 j() {
        Parcel a2 = a(12, r0());
        mp2 a3 = pp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final Bundle v() {
        Parcel a2 = a(9, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.xh
    public final void x(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(5, r0);
    }
}
