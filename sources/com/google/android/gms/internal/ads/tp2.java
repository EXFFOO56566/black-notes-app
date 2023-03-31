package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class tp2 extends h72 implements rp2 {
    tp2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final sp2 B0() {
        sp2 sp2;
        Parcel a2 = a(11, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            sp2 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            sp2 = queryLocalInterface instanceof sp2 ? (sp2) queryLocalInterface : new up2(readStrongBinder);
        }
        a2.recycle();
        return sp2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float H() {
        Parcel a2 = a(6, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float N() {
        Parcel a2 = a(7, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float Q() {
        Parcel a2 = a(9, r0());
        float readFloat = a2.readFloat();
        a2.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final int T() {
        Parcel a2 = a(5, r0());
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean V0() {
        Parcel a2 = a(4, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void a(sp2 sp2) {
        Parcel r0 = r0();
        i72.a(r0, sp2);
        b(8, r0);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void e(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void i1() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean j1() {
        Parcel a2 = a(10, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void p() {
        b(2, r0());
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void stop() {
        b(13, r0());
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean w0() {
        Parcel a2 = a(12, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }
}
