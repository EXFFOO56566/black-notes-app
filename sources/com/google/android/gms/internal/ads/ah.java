package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class ah extends j72 implements bh {
    public ah() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public static bh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
        return queryLocalInterface instanceof bh ? (bh) queryLocalInterface : new dh(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        if (i == 1) {
            a((kh) i72.a(parcel, kh.CREATOR));
        } else if (i != 2) {
            eh ehVar = null;
            zg zgVar = null;
            if (i == 3) {
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    ehVar = queryLocalInterface instanceof eh ? (eh) queryLocalInterface : new gh(readStrongBinder);
                }
                a(ehVar);
            } else if (i != 34) {
                switch (i) {
                    case 5:
                        z = M();
                        parcel2.writeNoException();
                        i72.a(parcel2, z);
                        break;
                    case 6:
                        p();
                        break;
                    case 7:
                        z();
                        break;
                    case 8:
                        destroy();
                        break;
                    case 9:
                        r(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                        break;
                    case 10:
                        l(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                        break;
                    case 11:
                        M(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                        break;
                    case 12:
                        String a2 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a2);
                        break;
                    case 13:
                        c(parcel.readString());
                        break;
                    case 14:
                        a(lo2.a(parcel.readStrongBinder()));
                        break;
                    case 15:
                        Bundle v = v();
                        parcel2.writeNoException();
                        i72.b(parcel2, v);
                        break;
                    case 16:
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 != null) {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                            zgVar = queryLocalInterface2 instanceof zg ? (zg) queryLocalInterface2 : new yg(readStrongBinder2);
                        }
                        a(zgVar);
                        break;
                    case 17:
                        k(parcel.readString());
                        break;
                    case 18:
                        p(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                        break;
                    case 19:
                        v(parcel.readString());
                        break;
                    case 20:
                        z = S1();
                        parcel2.writeNoException();
                        i72.a(parcel2, z);
                        break;
                    case 21:
                        mp2 j = j();
                        parcel2.writeNoException();
                        i72.a(parcel2, j);
                        break;
                    default:
                        return false;
                }
                return true;
            } else {
                a(i72.a(parcel));
            }
        } else {
            P();
        }
        parcel2.writeNoException();
        return true;
    }
}
