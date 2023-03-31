package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class up2 extends h72 implements sp2 {
    up2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final void O0() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final void W() {
        b(3, r0());
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final void Z() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final void b(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final void o0() {
        b(4, r0());
    }
}
