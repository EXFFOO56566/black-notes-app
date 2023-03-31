package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.s.j;

public final class zn2 extends h72 implements xn2 {
    zn2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final wn2 H1() {
        wn2 wn2;
        Parcel a2 = a(1, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            wn2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            wn2 = queryLocalInterface instanceof wn2 ? (wn2) queryLocalInterface : new yn2(readStrongBinder);
        }
        a2.recycle();
        return wn2;
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(j jVar) {
        Parcel r0 = r0();
        i72.a(r0, jVar);
        b(9, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(b3 b3Var) {
        Parcel r0 = r0();
        i72.a(r0, b3Var);
        b(4, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(l3 l3Var, um2 um2) {
        Parcel r0 = r0();
        i72.a(r0, l3Var);
        i72.a(r0, um2);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(m1 m1Var) {
        Parcel r0 = r0();
        i72.a(r0, m1Var);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(q3 q3Var) {
        Parcel r0 = r0();
        i72.a(r0, q3Var);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(q6 q6Var) {
        Parcel r0 = r0();
        i72.a(r0, q6Var);
        b(13, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(to2 to2) {
        Parcel r0 = r0();
        i72.a(r0, to2);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(w2 w2Var) {
        Parcel r0 = r0();
        i72.a(r0, w2Var);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(x6 x6Var) {
        Parcel r0 = r0();
        i72.a(r0, x6Var);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void a(String str, i3 i3Var, c3 c3Var) {
        Parcel r0 = r0();
        r0.writeString(str);
        i72.a(r0, i3Var);
        i72.a(r0, c3Var);
        b(5, r0);
    }

    @Override // com.google.android.gms.internal.ads.xn2
    public final void b(rn2 rn2) {
        Parcel r0 = r0();
        i72.a(r0, rn2);
        b(2, r0);
    }
}
