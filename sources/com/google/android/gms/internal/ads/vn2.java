package com.google.android.gms.internal.ads;

import android.os.Parcel;

public abstract class vn2 extends j72 implements wn2 {
    public vn2() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i != 1) {
            if (i == 2) {
                str = a();
            } else if (i == 3) {
                boolean u = u();
                parcel2.writeNoException();
                i72.a(parcel2, u);
                return true;
            } else if (i == 4) {
                str = V();
            } else if (i != 5) {
                return false;
            } else {
                a((rm2) i72.a(parcel, rm2.CREATOR), parcel.readInt());
            }
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        }
        b((rm2) i72.a(parcel, rm2.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
