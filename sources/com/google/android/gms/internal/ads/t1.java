package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class t1 extends j72 implements u1 {
    public t1() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        float f;
        IInterface iInterface;
        j3 j3Var;
        switch (i) {
            case 2:
                f = Q();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 3:
                n(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 4:
                iInterface = x1();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 5:
                f = H();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 6:
                f = N();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 7:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 8:
                boolean c1 = c1();
                parcel2.writeNoException();
                i72.a(parcel2, c1);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    j3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    j3Var = queryLocalInterface instanceof j3 ? (j3) queryLocalInterface : new m3(readStrongBinder);
                }
                a(j3Var);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
