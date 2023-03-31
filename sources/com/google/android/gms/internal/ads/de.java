package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class de extends h72 implements be {
    de(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void K1() {
        b(9, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void R0() {
        b(7, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final boolean Y1() {
        Parcel a2 = a(11, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void a(int i, int i2, Intent intent) {
        Parcel r0 = r0();
        r0.writeInt(i);
        r0.writeInt(i2);
        i72.a(r0, intent);
        b(12, r0);
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void j(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        Parcel a2 = a(6, r0);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void k(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void k1() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void m0() {
        b(3, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onDestroy() {
        b(8, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onPause() {
        b(5, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void onResume() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void v(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(13, r0);
    }

    @Override // com.google.android.gms.internal.ads.be
    public final void z1() {
        b(10, r0());
    }
}
