package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b.c.b.a.d.a;
import java.util.List;

public final class ua extends h72 implements sa {
    ua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle A1() {
        Parcel a2 = a(19, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void F(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(30, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final a F1() {
        Parcel a2 = a(2, r0());
        a a3 = a.AbstractBinderC0058a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final gb J0() {
        gb gbVar;
        Parcel a2 = a(16, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            gbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            gbVar = queryLocalInterface instanceof gb ? (gb) queryLocalInterface : new ib(readStrongBinder);
        }
        a2.recycle();
        return gbVar;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final hb P1() {
        hb hbVar;
        Parcel a2 = a(27, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            hbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            hbVar = queryLocalInterface instanceof hb ? (hb) queryLocalInterface : new jb(readStrongBinder);
        }
        a2.recycle();
        return hbVar;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, g6 g6Var, List<o6> list) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, g6Var);
        r0.writeTypedList(list);
        b(31, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, ph phVar, List<String> list) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, phVar);
        r0.writeStringList(list);
        b(23, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, ph phVar, String str2) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, rm2);
        r0.writeString(str);
        i72.a(r0, phVar);
        r0.writeString(str2);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, xa xaVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, rm2);
        r0.writeString(str);
        i72.a(r0, xaVar);
        b(28, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, String str2, xa xaVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, rm2);
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, xaVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, rm2 rm2, String str, String str2, xa xaVar, m1 m1Var, List<String> list) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, rm2);
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, xaVar);
        i72.a(r0, m1Var);
        r0.writeStringList(list);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, um2 um2, rm2 rm2, String str, xa xaVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        i72.a(r0, rm2);
        r0.writeString(str);
        i72.a(r0, xaVar);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(a aVar, um2 um2, rm2 rm2, String str, String str2, xa xaVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, um2);
        i72.a(r0, rm2);
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, xaVar);
        b(6, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(rm2 rm2, String str) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        r0.writeString(str);
        b(11, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(rm2 rm2, String str, String str2) {
        Parcel r0 = r0();
        i72.a(r0, rm2);
        r0.writeString(str);
        r0.writeString(str2);
        b(20, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(boolean z) {
        Parcel r0 = r0();
        i72.a(r0, z);
        b(25, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ed a0() {
        Parcel a2 = a(34, r0());
        ed edVar = (ed) i72.a(a2, ed.CREATOR);
        a2.recycle();
        return edVar;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void b(a aVar, rm2 rm2, String str, xa xaVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, rm2);
        r0.writeString(str);
        i72.a(r0, xaVar);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void c(a aVar, rm2 rm2, String str, xa xaVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        i72.a(r0, rm2);
        r0.writeString(str);
        i72.a(r0, xaVar);
        b(32, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void destroy() {
        b(5, r0());
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final boolean f1() {
        Parcel a2 = a(22, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle getInterstitialAdapterInfo() {
        Parcel a2 = a(18, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final rp2 getVideoController() {
        Parcel a2 = a(26, r0());
        rp2 a3 = qp2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void h(a aVar) {
        Parcel r0 = r0();
        i72.a(r0, aVar);
        b(21, r0);
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ed h0() {
        Parcel a2 = a(33, r0());
        ed edVar = (ed) i72.a(a2, ed.CREATOR);
        a2.recycle();
        return edVar;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final boolean isInitialized() {
        Parcel a2 = a(13, r0());
        boolean a3 = i72.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final ab n1() {
        ab abVar;
        Parcel a2 = a(15, r0());
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            abVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            abVar = queryLocalInterface instanceof ab ? (ab) queryLocalInterface : new db(readStrongBinder);
        }
        a2.recycle();
        return abVar;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void p() {
        b(8, r0());
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void showInterstitial() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void showVideo() {
        b(12, r0());
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void z() {
        b(9, r0());
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final s2 z0() {
        Parcel a2 = a(24, r0());
        s2 a3 = v2.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final Bundle zzti() {
        Parcel a2 = a(17, r0());
        Bundle bundle = (Bundle) i72.a(a2, Bundle.CREATOR);
        a2.recycle();
        return bundle;
    }
}
