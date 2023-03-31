package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public abstract class z3 extends j72 implements w3 {
    public z3() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        List list;
        IInterface iInterface;
        boolean z;
        v3 v3Var;
        switch (i) {
            case 2:
                str = b();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                list = h();
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                str = d();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                iInterface = t();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 6:
                str = f();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 7:
                str = q();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                double k = k();
                parcel2.writeNoException();
                parcel2.writeDouble(k);
                return true;
            case 9:
                str = r();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 10:
                str = o();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 12:
                str = a();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                destroy();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterface = e();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 15:
                b((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                z = a((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 17:
                d((Bundle) i72.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                iInterface = n();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 19:
                iInterface = c();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 20:
                Bundle g = g();
                parcel2.writeNoException();
                i72.b(parcel2, g);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    v3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    v3Var = queryLocalInterface instanceof v3 ? (v3) queryLocalInterface : new x3(readStrongBinder);
                }
                a(v3Var);
                parcel2.writeNoException();
                return true;
            case 22:
                X();
                parcel2.writeNoException();
                return true;
            case 23:
                list = H0();
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 24:
                z = v1();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 25:
                a(ep2.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                a(bp2.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 27:
                i0();
                parcel2.writeNoException();
                return true;
            case 28:
                N1();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterface = b0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 30:
                z = n0();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 31:
                iInterface = j();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 32:
                a(kp2.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
