package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class g3 extends j72 implements c3 {
    public g3() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static c3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof c3 ? (c3) queryLocalInterface : new f3(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        s2 s2Var;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            s2Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            s2Var = queryLocalInterface instanceof s2 ? (s2) queryLocalInterface : new u2(readStrongBinder);
        }
        a(s2Var, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
