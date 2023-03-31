package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class vp2 extends j72 implements sp2 {
    public vp2() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            O0();
        } else if (i == 2) {
            Z();
        } else if (i == 3) {
            W();
        } else if (i == 4) {
            o0();
        } else if (i != 5) {
            return false;
        } else {
            b(i72.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
