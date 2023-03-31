package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class gh extends h72 implements eh {
    gh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void A() {
        b(8, r0());
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void a(ug ugVar) {
        Parcel r0 = r0();
        i72.a(r0, ugVar);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void c(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void c0() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void f0() {
        b(6, r0());
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void g0() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void k0() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void y() {
        b(3, r0());
    }
}
