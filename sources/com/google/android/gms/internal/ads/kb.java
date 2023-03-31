package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.List;

public abstract class kb extends j72 implements hb {
    public kb() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static hb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof hb ? (hb) queryLocalInterface : new jb(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        IInterface iInterface;
        boolean z;
        float f;
        switch (i) {
            case 2:
                str = b();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List h = h();
                parcel2.writeNoException();
                parcel2.writeList(h);
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
                iInterface = e();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 13:
                iInterface = C();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 14:
                iInterface = w();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 15:
                iInterface = c();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 16:
                Bundle g = g();
                parcel2.writeNoException();
                i72.b(parcel2, g);
                return true;
            case 17:
                z = E();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 18:
                z = F();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 19:
                i();
                parcel2.writeNoException();
                return true;
            case 20:
                b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 21:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 23:
                f = L0();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 24:
                f = r1();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            case 25:
                f = g1();
                parcel2.writeNoException();
                parcel2.writeFloat(f);
                return true;
            default:
                return false;
        }
    }
}
