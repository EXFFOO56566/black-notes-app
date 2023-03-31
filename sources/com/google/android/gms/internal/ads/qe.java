package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class qe extends j72 implements re {
    public static re a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof re ? (re) queryLocalInterface : new te(iBinder);
    }
}
