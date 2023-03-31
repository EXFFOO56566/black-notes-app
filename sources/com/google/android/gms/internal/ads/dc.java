package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class dc extends j72 implements ec {
    public dc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            J(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
