package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import b.c.b.a.d.a;

public final class sc extends h72 implements qc {
    sc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final boolean B(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(15, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final boolean H(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        Parcel a2 = a(17, r0);
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(a aVar, String str, Bundle bundle, Bundle bundle2, um2 um2, rc rcVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        r0.writeString(str);
        i72.a(r0, bundle);
        i72.a(r0, bundle2);
        i72.a(r0, um2);
        i72.a(r0, rcVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, ec ecVar, xa xaVar, um2 um2) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, rm2);
        i72.a(r0, aVar);
        i72.a(r0, ecVar);
        i72.a(r0, xaVar);
        i72.a(r0, um2);
        b(13, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, fc fcVar, xa xaVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, rm2);
        i72.a(r0, aVar);
        i72.a(r0, fcVar);
        i72.a(r0, xaVar);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, kc kcVar, xa xaVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, rm2);
        i72.a(r0, aVar);
        i72.a(r0, kcVar);
        i72.a(r0, xaVar);
        b(18, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String str, String str2, rm2 rm2, a aVar, lc lcVar, xa xaVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, rm2);
        i72.a(r0, aVar);
        i72.a(r0, lcVar);
        i72.a(r0, xaVar);
        b(16, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void a(String[] strArr, Bundle[] bundleArr) {
        Parcel r0 = r0();
        r0.writeStringArray(strArr);
        r0.writeTypedArray(bundleArr, 0);
        b(11, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final ed a0() {
        Parcel a2 = a(3, r0());
        ed edVar = (ed) i72.a(a2, ed.CREATOR);
        a2.recycle();
        return edVar;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void b(String str, String str2, rm2 rm2, a aVar, lc lcVar, xa xaVar) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, rm2);
        i72.a(r0, aVar);
        i72.a(r0, lcVar);
        i72.a(r0, xaVar);
        b(20, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final rp2 getVideoController() {
        Parcel a2 = a(5, r0());
        rp2 a3 = qp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final ed h0() {
        Parcel a2 = a(2, r0());
        ed edVar = (ed) i72.a(a2, ed.CREATOR);
        a2.recycle();
        return edVar;
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void r(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(19, r0);
    }

    @Override // com.google.android.gms.internal.ads.qc
    public final void y(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(10, r0);
    }
}
