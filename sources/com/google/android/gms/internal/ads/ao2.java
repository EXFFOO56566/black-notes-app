package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.s.j;

public abstract class ao2 extends j72 implements xn2 {
    public ao2() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        rn2 rn2 = null;
        to2 to2 = null;
        switch (i) {
            case 1:
                wn2 H1 = H1();
                parcel2.writeNoException();
                i72.a(parcel2, H1);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    rn2 = queryLocalInterface instanceof rn2 ? (rn2) queryLocalInterface : new tn2(readStrongBinder);
                }
                b(rn2);
                break;
            case 3:
                a(z2.a(parcel.readStrongBinder()));
                break;
            case 4:
                a(a3.a(parcel.readStrongBinder()));
                break;
            case 5:
                a(parcel.readString(), h3.a(parcel.readStrongBinder()), g3.a(parcel.readStrongBinder()));
                break;
            case 6:
                a((m1) i72.a(parcel, m1.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    to2 = queryLocalInterface2 instanceof to2 ? (to2) queryLocalInterface2 : new so2(readStrongBinder2);
                }
                a(to2);
                break;
            case 8:
                a(o3.a(parcel.readStrongBinder()), (um2) i72.a(parcel, um2.CREATOR));
                break;
            case 9:
                a((j) i72.a(parcel, j.CREATOR));
                break;
            case 10:
                a(p3.a(parcel.readStrongBinder()));
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                a((q6) i72.a(parcel, q6.CREATOR));
                break;
            case 14:
                a(a7.a(parcel.readStrongBinder()));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
