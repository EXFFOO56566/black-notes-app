package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class wa extends j72 implements xa {
    public wa() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static xa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof xa ? (xa) queryLocalInterface : new za(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        ya yaVar;
        switch (i) {
            case 1:
                l();
                break;
            case 2:
                x();
                break;
            case 3:
                a(parcel.readInt());
                break;
            case 4:
                G();
                break;
            case 5:
                B();
                break;
            case 6:
                s();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    yaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    yaVar = queryLocalInterface instanceof ya ? (ya) queryLocalInterface : new bb(readStrongBinder);
                }
                a(yaVar);
                break;
            case 8:
                K();
                break;
            case 9:
                a(parcel.readString(), parcel.readString());
                break;
            case 10:
                a(v2.a(parcel.readStrongBinder()), parcel.readString());
                break;
            case 11:
                o0();
                break;
            case 12:
                u(parcel.readString());
                break;
            case 13:
                u0();
                break;
            case 14:
                a((uh) i72.a(parcel, uh.CREATOR));
                break;
            case 15:
                W();
                break;
            case 16:
                a(vh.a(parcel.readStrongBinder()));
                break;
            case 17:
                d(parcel.readInt());
                break;
            case 18:
                M1();
                break;
            case 19:
                c((Bundle) i72.a(parcel, Bundle.CREATOR));
                break;
            case 20:
                Z();
                break;
            case 21:
                f(parcel.readString());
                break;
            case 22:
                a(parcel.readInt(), parcel.readString());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
