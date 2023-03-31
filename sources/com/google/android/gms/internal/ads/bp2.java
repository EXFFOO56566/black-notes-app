package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bp2 extends j72 implements yo2 {
    public static yo2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
        return queryLocalInterface instanceof yo2 ? (yo2) queryLocalInterface : new ap2(iBinder);
    }
}
