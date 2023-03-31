package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class jc extends j72 implements kc {
    public jc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(kb.a(parcel.readStrongBinder()));
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
