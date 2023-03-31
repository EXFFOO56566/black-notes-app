package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class ri2 extends j72 implements si2 {
    public ri2() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        wi2 wi2;
        if (i == 2) {
            eo2 a1 = a1();
            parcel2.writeNoException();
            i72.a(parcel2, a1);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                wi2 = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                wi2 = queryLocalInterface instanceof wi2 ? (wi2) queryLocalInterface : new xi2(readStrongBinder);
            }
            a(wi2);
            parcel2.writeNoException();
            return true;
        }
    }
}
