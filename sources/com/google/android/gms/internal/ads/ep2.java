package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ep2 extends j72 implements cp2 {
    public ep2() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static cp2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof cp2 ? (cp2) queryLocalInterface : new dp2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = U0();
        } else if (i != 2) {
            return false;
        } else {
            str = B1();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
