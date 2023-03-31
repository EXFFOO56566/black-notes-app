package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class y5 extends h72 implements v5 {
    y5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    @Override // com.google.android.gms.internal.ads.v5
    public final void a(p5 p5Var, t5 t5Var) {
        Parcel r0 = r0();
        i72.a(r0, p5Var);
        i72.a(r0, t5Var);
        c(2, r0);
    }
}
