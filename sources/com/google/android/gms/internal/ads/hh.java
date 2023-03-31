package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class hh extends j72 implements eh {
    public hh() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public static eh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof eh ? (eh) queryLocalInterface : new gh(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        ug ugVar;
        switch (i) {
            case 1:
                k0();
                break;
            case 2:
                g0();
                break;
            case 3:
                y();
                break;
            case 4:
                c0();
                break;
            case 5:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    ugVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardItem");
                    ugVar = queryLocalInterface instanceof ug ? (ug) queryLocalInterface : new wg(readStrongBinder);
                }
                a(ugVar);
                break;
            case 6:
                f0();
                break;
            case 7:
                c(parcel.readInt());
                break;
            case 8:
                A();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
