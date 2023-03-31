package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class jp2 extends j72 implements gp2 {
    public static gp2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
        return queryLocalInterface instanceof gp2 ? (gp2) queryLocalInterface : new ip2(iBinder);
    }
}
