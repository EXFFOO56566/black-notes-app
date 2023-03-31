package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class b2 extends h72 implements z1 {
    b2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void L(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(9, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void a(a aVar, int i) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeInt(i);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void a(u1 u1Var) {
        Parcel r0 = r0();
        i72.a(r0, u1Var);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void a(String str, a aVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        i72.a(r0, aVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void destroy() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void e(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void j(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final a t(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        Parcel a2 = a(2, r0);
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
