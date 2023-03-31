package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class k6 extends j72 implements l6 {
    public k6() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static l6 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof l6 ? (l6) queryLocalInterface : new n6(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a(parcel.createTypedArrayList(e6.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
