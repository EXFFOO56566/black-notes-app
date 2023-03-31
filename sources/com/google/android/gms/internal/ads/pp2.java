package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class pp2 extends j72 implements mp2 {
    public pp2() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static mp2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof mp2 ? (mp2) queryLocalInterface : new op2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = a();
        } else if (i != 2) {
            return false;
        } else {
            str = Z0();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
