package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;

public abstract class ae extends j72 implements be {
    public ae() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static be a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof be ? (be) queryLocalInterface : new de(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.j72
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                k((Bundle) i72.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                k1();
                break;
            case 3:
                m0();
                break;
            case 4:
                onResume();
                break;
            case 5:
                onPause();
                break;
            case 6:
                Bundle bundle = (Bundle) i72.a(parcel, Bundle.CREATOR);
                j(bundle);
                parcel2.writeNoException();
                i72.b(parcel2, bundle);
                return true;
            case 7:
                R0();
                break;
            case 8:
                onDestroy();
                break;
            case 9:
                K1();
                break;
            case 10:
                z1();
                break;
            case 11:
                boolean Y1 = Y1();
                parcel2.writeNoException();
                i72.a(parcel2, Y1);
                return true;
            case 12:
                a(parcel.readInt(), parcel.readInt(), (Intent) i72.a(parcel, Intent.CREATOR));
                break;
            case 13:
                v(a.AbstractBinderC0058a.a(parcel.readStrongBinder()));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
