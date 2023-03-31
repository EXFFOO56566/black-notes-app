package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class qo2 extends h72 implements oo2 {
    qo2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final vo2 I(a aVar) {
        vo2 vo2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(4, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            vo2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            vo2 = queryLocalInterface instanceof vo2 ? (vo2) queryLocalInterface : new xo2(readStrongBinder);
        }
        a2.recycle();
        return vo2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 a(a aVar, um2 um2, String str, int i) {
        eo2 eo2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        r0.writeString(str);
        r0.writeInt(i);
        Parcel a2 = a(10, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            eo2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            eo2 = queryLocalInterface instanceof eo2 ? (eo2) queryLocalInterface : new ho2(readStrongBinder);
        }
        a2.recycle();
        return eo2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 a(a aVar, um2 um2, String str, ra raVar, int i) {
        eo2 eo2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(13, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            eo2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            eo2 = queryLocalInterface instanceof eo2 ? (eo2) queryLocalInterface : new ho2(readStrongBinder);
        }
        a2.recycle();
        return eo2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final bh b(a aVar, ra raVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(6, r0);
        bh a3 = ah.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 b(a aVar, um2 um2, String str, ra raVar, int i) {
        eo2 eo2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(2, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            eo2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            eo2 = queryLocalInterface instanceof eo2 ? (eo2) queryLocalInterface : new ho2(readStrongBinder);
        }
        a2.recycle();
        return eo2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final h2 b(a aVar, a aVar2, a aVar3) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, aVar2);
        i72.a(r0, aVar3);
        Parcel a2 = a(11, r0);
        h2 a3 = g2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final xn2 b(a aVar, String str, ra raVar, int i) {
        xn2 xn2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(3, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            xn2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            xn2 = queryLocalInterface instanceof xn2 ? (xn2) queryLocalInterface : new zn2(readStrongBinder);
        }
        a2.recycle();
        return xn2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final eo2 c(a aVar, um2 um2, String str, ra raVar, int i) {
        eo2 eo2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(1, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            eo2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            eo2 = queryLocalInterface instanceof eo2 ? (eo2) queryLocalInterface : new ho2(readStrongBinder);
        }
        a2.recycle();
        return eo2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final xh c(a aVar, String str, ra raVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        i72.a(r0, raVar);
        r0.writeInt(i);
        Parcel a2 = a(12, r0);
        xh a3 = ai.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final vo2 d(a aVar, int i) {
        vo2 vo2;
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeInt(i);
        Parcel a2 = a(9, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            vo2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            vo2 = queryLocalInterface instanceof vo2 ? (vo2) queryLocalInterface : new xo2(readStrongBinder);
        }
        a2.recycle();
        return vo2;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final z1 d(a aVar, a aVar2) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, aVar2);
        Parcel a2 = a(5, r0);
        z1 a3 = c2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final be g(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(8, r0);
        be a3 = ae.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.oo2
    public final me w(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(7, r0);
        me a3 = pe.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
