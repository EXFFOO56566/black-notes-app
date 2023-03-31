package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class oh extends j72 implements ph {
    public oh() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static ph a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof ph ? (ph) queryLocalInterface : new sh(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                N(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 2:
                b(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 3:
                k(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 4:
                s(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 5:
                C(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 6:
                K(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 7:
                a(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), (uh) i72.a(parcel, uh.CREATOR));
                break;
            case 8:
                i(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 9:
                c(a.AbstractBinderC0058a.a(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                q(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 11:
                z(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            case 12:
                c((Bundle) i72.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
