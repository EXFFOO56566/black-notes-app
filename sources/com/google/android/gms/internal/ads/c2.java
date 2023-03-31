package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class c2 extends j72 implements z1 {
    public c2() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static z1 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof z1 ? (z1) queryLocalInterface : new b2(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        u1 u1Var;
        switch (i) {
            case 1:
                a(parcel.readString(), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 2:
                a t = t(parcel.readString());
                parcel2.writeNoException();
                i72.a(parcel2, t);
                return true;
            case 3:
                e(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 4:
                destroy();
                break;
            case 5:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 6:
                c(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 7:
                j(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    u1Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    u1Var = queryLocalInterface instanceof u1 ? (u1) queryLocalInterface : new w1(readStrongBinder);
                }
                a(u1Var);
                break;
            case 9:
                L(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
