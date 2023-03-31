package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public final class ke extends j72 implements le {
    public static le a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof le ? (le) queryLocalInterface : new ne(iBinder);
    }
}
