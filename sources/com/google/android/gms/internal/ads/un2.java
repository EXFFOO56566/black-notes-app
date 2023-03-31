package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class un2 extends j72 implements rn2 {
    public un2() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                x();
                break;
            case 2:
                a(parcel.readInt());
                break;
            case 3:
                G();
                break;
            case 4:
                s();
                break;
            case 5:
                B();
                break;
            case 6:
                l();
                break;
            case 7:
                K();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
