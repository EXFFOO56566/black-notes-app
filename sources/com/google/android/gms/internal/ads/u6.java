package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class u6 extends j72 implements s6 {
    public u6() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        w6 w6Var;
        if (i != 3) {
            if (i == 4) {
                destroy();
            } else if (i == 5) {
                a a2 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    w6Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    w6Var = queryLocalInterface instanceof w6 ? (w6) queryLocalInterface : new y6(readStrongBinder);
                }
                a(a2, w6Var);
            } else if (i == 6) {
                o(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
            } else if (i != 7) {
                return false;
            } else {
                iInterface = b0();
            }
            parcel2.writeNoException();
            return true;
        }
        iInterface = getVideoController();
        parcel2.writeNoException();
        i72.a(parcel2, iInterface);
        return true;
    }
}
