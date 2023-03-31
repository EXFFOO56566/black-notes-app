package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

public final class n6 extends h72 implements l6 {
    n6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.l6
    public final void a(List<e6> list) {
        Parcel r0 = r0();
        r0.writeTypedList(list);
        b(1, r0);
    }
}
