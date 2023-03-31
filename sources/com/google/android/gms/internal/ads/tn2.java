package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class tn2 extends h72 implements rn2 {
    tn2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void B() {
        b(5, r0());
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void G() {
        b(3, r0());
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void K() {
        b(7, r0());
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void a(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void l() {
        b(6, r0());
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void s() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void x() {
        b(1, r0());
    }
}
