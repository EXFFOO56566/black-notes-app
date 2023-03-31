package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class ui2 extends h72 implements ti2 {
    ui2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.ti2
    public final void a(si2 si2) {
        Parcel r0 = r0();
        i72.a(r0, si2);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.ti2
    public final void f(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(2, r0);
    }
}
