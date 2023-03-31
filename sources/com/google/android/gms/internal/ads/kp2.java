package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class kp2 extends j72 implements lp2 {
    public kp2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static lp2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof lp2 ? (lp2) queryLocalInterface : new np2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((wm2) i72.a(parcel, wm2.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
