package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class g2 extends j72 implements h2 {
    public g2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static h2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof h2 ? (h2) queryLocalInterface : new j2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            e(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
        } else if (i == 2) {
            p1();
        } else if (i != 3) {
            return false;
        } else {
            c(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
