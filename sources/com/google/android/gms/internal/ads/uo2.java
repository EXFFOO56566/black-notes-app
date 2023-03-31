package com.google.android.gms.internal.ads;

import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.List;

public abstract class uo2 extends j72 implements vo2 {
    public uo2() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                L();
                break;
            case 2:
                a(parcel.readFloat());
                break;
            case 3:
                h(parcel.readString());
                break;
            case 4:
                d(i72.a(parcel));
                break;
            case 5:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 6:
                b(parcel.readString(), a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 7:
                float o1 = o1();
                parcel2.writeNoException();
                parcel2.writeFloat(o1);
                return true;
            case 8:
                boolean N0 = N0();
                parcel2.writeNoException();
                i72.a(parcel2, N0);
                return true;
            case 9:
                String W1 = W1();
                parcel2.writeNoException();
                parcel2.writeString(W1);
                return true;
            case 10:
                l(parcel.readString());
                break;
            case 11:
                a(qa.a(parcel.readStrongBinder()));
                break;
            case 12:
                a(k6.a(parcel.readStrongBinder()));
                break;
            case 13:
                List<e6> V1 = V1();
                parcel2.writeNoException();
                parcel2.writeTypedList(V1);
                return true;
            case 14:
                a((yq2) i72.a(parcel, yq2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
