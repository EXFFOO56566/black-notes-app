package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class xj extends j72 implements vj {
    public xj() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        uj ujVar;
        a aVar;
        switch (i) {
            case 1:
                a a2 = a.AbstractBinderC0058a.a(parcel.readStrongBinder());
                yj yjVar = (yj) i72.a(parcel, yj.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ujVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    ujVar = queryLocalInterface instanceof uj ? (uj) queryLocalInterface : new wj(readStrongBinder);
                }
                a(a2, yjVar, ujVar);
                parcel2.writeNoException();
                return true;
            case 2:
                G(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 3:
                aVar = c(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                i72.a(parcel2, aVar);
                return true;
            case 4:
                aVar = f(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                i72.a(parcel2, aVar);
                return true;
            case 5:
                a(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC0058a.a(parcel.readStrongBinder()), we.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                b(parcel.createTypedArrayList(Uri.CREATOR), a.AbstractBinderC0058a.a(parcel.readStrongBinder()), we.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                a((xe) i72.a(parcel, xe.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
