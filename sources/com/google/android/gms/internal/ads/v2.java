package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.List;

public abstract class v2 extends j72 implements s2 {
    public v2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static s2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof s2 ? (s2) queryLocalInterface : new u2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        IInterface iInterface;
        boolean z;
        switch (i) {
            case 1:
                str = w(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 2:
                iInterface = g(parcel.readString());
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 3:
                List<String> p0 = p0();
                parcel2.writeNoException();
                parcel2.writeStringList(p0);
                return true;
            case 4:
                str = Y();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                i(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                i();
                parcel2.writeNoException();
                return true;
            case 7:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 8:
                destroy();
                parcel2.writeNoException();
                return true;
            case 9:
                iInterface = P0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 10:
                z = O(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 11:
                iInterface = n();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 12:
                z = X1();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 13:
                z = C1();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 14:
                D(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                h1();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
