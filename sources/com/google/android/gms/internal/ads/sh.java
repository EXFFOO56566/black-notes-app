package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class sh extends h72 implements ph {
    sh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void C(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void K(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void N(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void a(a aVar, uh uhVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, uhVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void b(a aVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeInt(i);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void c(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(12, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void c(a aVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeInt(i);
        b(9, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void i(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void k(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void q(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void s(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(4, r0);
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final void z(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(11, r0);
    }
}
