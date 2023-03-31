package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.List;

public abstract class fb extends j72 implements gb {
    public fb() {
        super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        IInterface iInterface;
        boolean z;
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
                iInterface = d0();
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
                i();
                parcel2.writeNoException();
                return true;
            case 9:
                b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 10:
                d(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 11:
                z = E();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 12:
                z = F();
                parcel2.writeNoException();
                i72.a(parcel2, z);
                return true;
            case 13:
                Bundle g = g();
                parcel2.writeNoException();
                i72.b(parcel2, g);
                return true;
            case 14:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface = C();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 16:
                iInterface = getVideoController();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 17:
            case 18:
            default:
                return false;
            case 19:
                iInterface = e();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 20:
                iInterface = w();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 21:
                iInterface = c();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 22:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
