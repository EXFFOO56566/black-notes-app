package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class s extends j72 implements t {
    public s() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i == 1) {
            str = L1();
        } else if (i != 2) {
            if (i == 3) {
                t(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
            } else if (i == 4) {
                d1();
            } else if (i != 5) {
                return false;
            } else {
                i();
            }
            parcel2.writeNoException();
            return true;
        } else {
            str = a2();
        }
        parcel2.writeNoException();
        parcel2.writeString(str);
        return true;
    }
}
