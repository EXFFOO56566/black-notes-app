package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class ro2 extends j72 implements oo2 {
    public ro2() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        switch (i) {
            case 1:
                iInterface = c(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), (um2) i72.a(parcel, um2.CREATOR), parcel.readString(), qa.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 2:
                iInterface = b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), (um2) i72.a(parcel, um2.CREATOR), parcel.readString(), qa.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                iInterface = b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readString(), qa.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 4:
                iInterface = I(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 5:
                iInterface = d(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 6:
                iInterface = b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), qa.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 7:
                iInterface = w(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 8:
                iInterface = g(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 9:
                iInterface = d(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                iInterface = a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), (um2) i72.a(parcel, um2.CREATOR), parcel.readString(), parcel.readInt());
                break;
            case 11:
                iInterface = b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 12:
                iInterface = c(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readString(), qa.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 13:
                iInterface = a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), (um2) i72.a(parcel, um2.CREATOR), parcel.readString(), qa.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        i72.a(parcel2, iInterface);
        return true;
    }
}
