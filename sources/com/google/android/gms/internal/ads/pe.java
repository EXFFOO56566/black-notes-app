package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class pe extends j72 implements me {
    public static me a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return queryLocalInterface instanceof me ? (me) queryLocalInterface : new oe(iBinder);
    }
}
