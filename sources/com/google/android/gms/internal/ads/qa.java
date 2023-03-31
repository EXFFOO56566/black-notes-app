package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class qa extends j72 implements ra {
    public qa() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static ra a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof ra ? (ra) queryLocalInterface : new ta(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        if (i == 1) {
            iInterface = p(parcel.readString());
        } else if (i == 2) {
            boolean x = x(parcel.readString());
            parcel2.writeNoException();
            i72.a(parcel2, x);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            iInterface = n(parcel.readString());
        }
        parcel2.writeNoException();
        i72.a(parcel2, iInterface);
        return true;
    }
}
