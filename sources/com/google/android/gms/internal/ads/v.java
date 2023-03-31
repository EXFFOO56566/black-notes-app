package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class v extends h72 implements t {
    v(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.t
    public final String L1() {
        Parcel a2 = a(1, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.t
    public final String a2() {
        Parcel a2 = a(2, r0());
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.t
    public final void d1() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.t
    public final void i() {
        b(5, r0());
    }

    @Override // com.google.android.gms.internal.ads.t
    public final void t(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(3, r0);
    }
}
