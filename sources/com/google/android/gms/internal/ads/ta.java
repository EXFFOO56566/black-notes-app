package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class ta extends h72 implements ra {
    ta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final qc n(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        Parcel a2 = a(3, r0);
        qc a3 = pc.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final sa p(String str) {
        sa saVar;
        Parcel r0 = r0();
        r0.writeString(str);
        Parcel a2 = a(1, r0);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            saVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            saVar = queryLocalInterface instanceof sa ? (sa) queryLocalInterface : new ua(readStrongBinder);
        }
        a2.recycle();
        return saVar;
    }

    @Override // com.google.android.gms.internal.ads.ra
    public final boolean x(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        Parcel a2 = a(2, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }
}
