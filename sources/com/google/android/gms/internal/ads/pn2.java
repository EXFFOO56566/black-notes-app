package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class pn2 extends j72 implements qn2 {
    public pn2() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        l();
        parcel2.writeNoException();
        return true;
    }
}
