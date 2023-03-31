package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class qp2 extends j72 implements rp2 {
    public qp2() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static rp2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof rp2 ? (rp2) queryLocalInterface : new tp2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        float f;
        sp2 sp2;
        switch (i) {
            case 1:
                i1();
                parcel2.writeNoException();
                return true;
            case 2:
                p();
                parcel2.writeNoException();
                return true;
            case 3:
                e(i72.a(parcel));
                parcel2.writeNoException();
                return true;
            case 4:
                z = V0();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 5:
                int T = T();
                parcel2.writeNoException();
                parcel2.writeInt(T);
                return true;
            case 6:
                f = H();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 7:
                f = N();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    sp2 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    sp2 = queryLocalInterface instanceof sp2 ? (sp2) queryLocalInterface : new up2(readStrongBinder);
                }
                a(sp2);
                parcel2.writeNoException();
                return true;
            case 9:
                f = Q();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 10:
                z = j1();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 11:
                sp2 B0 = B0();
                parcel2.writeNoException();
                i72.a(parcel2, B0);
                return true;
            case 12:
                z = w0();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 13:
                stop();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
