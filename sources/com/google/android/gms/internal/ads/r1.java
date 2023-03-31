package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class r1 extends j72 implements o1 {
    public r1() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static o1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof o1 ? (o1) queryLocalInterface : new q1(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String D0 = D0();
            parcel2.writeNoException();
            parcel2.writeString(D0);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List<v1> q0 = q0();
            parcel2.writeNoException();
            parcel2.writeList(q0);
            return true;
        }
    }
}
