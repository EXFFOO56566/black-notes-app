package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class sf extends h72 implements qf {
    sf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final lf a(jf jfVar) {
        Parcel r0 = r0();
        i72.a(r0, jfVar);
        Parcel a2 = a(1, r0);
        lf lfVar = (lf) i72.a(a2, lf.CREATOR);
        a2.recycle();
        return lfVar;
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void a(jf jfVar, rf rfVar) {
        Parcel r0 = r0();
        i72.a(r0, jfVar);
        i72.a(r0, rfVar);
        b(2, r0);
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void a(zf zfVar, tf tfVar) {
        Parcel r0 = r0();
        i72.a(r0, zfVar);
        i72.a(r0, tfVar);
        b(4, r0);
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void a(String str, tf tfVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        i72.a(r0, tfVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void b(zf zfVar, tf tfVar) {
        Parcel r0 = r0();
        i72.a(r0, zfVar);
        i72.a(r0, tfVar);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.qf
    public final void c(zf zfVar, tf tfVar) {
        Parcel r0 = r0();
        i72.a(r0, zfVar);
        i72.a(r0, tfVar);
        b(5, r0);
    }
}
