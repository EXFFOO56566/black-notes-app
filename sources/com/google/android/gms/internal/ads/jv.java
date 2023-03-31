package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

public abstract class jv extends j72 implements gv {
    public static gv a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof gv ? (gv) queryLocalInterface : new iv(iBinder);
    }
}
