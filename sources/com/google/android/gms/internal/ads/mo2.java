package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class mo2 extends j72 implements no2 {
    public mo2() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static no2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof no2 ? (no2) queryLocalInterface : new po2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
