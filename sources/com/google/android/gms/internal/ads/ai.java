package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class ai extends j72 implements xh {
    public ai() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static xh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof xh ? (xh) queryLocalInterface : new zh(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        di diVar = null;
        di diVar2 = null;
        gi giVar = null;
        bi biVar = null;
        switch (i) {
            case 1:
                rm2 rm2 = (rm2) i72.a(parcel, rm2.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    diVar = queryLocalInterface instanceof di ? (di) queryLocalInterface : new ei(readStrongBinder);
                }
                a(rm2, diVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    biVar = queryLocalInterface2 instanceof bi ? (bi) queryLocalInterface2 : new ci(readStrongBinder2);
                }
                a(biVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean M = M();
                parcel2.writeNoException();
                i72.a(parcel2, M);
                return true;
            case 4:
                String a2 = a();
                parcel2.writeNoException();
                parcel2.writeString(a2);
                return true;
            case 5:
                x(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    giVar = queryLocalInterface3 instanceof gi ? (gi) queryLocalInterface3 : new fi(readStrongBinder3);
                }
                a(giVar);
                parcel2.writeNoException();
                return true;
            case 7:
                a((ji) i72.a(parcel, ji.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                a(jp2.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle v = v();
                parcel2.writeNoException();
                i72.b(parcel2, v);
                return true;
            case 10:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), i72.a(parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                iInterface = I0();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 12:
                iInterface = j();
                parcel2.writeNoException();
                i72.a(parcel2, iInterface);
                return true;
            case 13:
                a(kp2.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                rm2 rm22 = (rm2) i72.a(parcel, rm2.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    diVar2 = queryLocalInterface4 instanceof di ? (di) queryLocalInterface4 : new ei(readStrongBinder4);
                }
                b(rm22, diVar2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
