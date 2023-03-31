package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class w1 extends h72 implements u1 {
    w1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final float H() {
        Parcel a2 = a(5, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final float N() {
        Parcel a2 = a(6, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final float Q() {
        Parcel a2 = a(2, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void a(j3 j3Var) {
        Parcel r0 = r0();
        i72.a(r0, j3Var);
        b(9, r0);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean c1() {
        Parcel a2 = a(8, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final rp2 getVideoController() {
        Parcel a2 = a(7, r0());
        rp2 a3 = qp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void n(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final a x1() {
        Parcel a2 = a(4, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
