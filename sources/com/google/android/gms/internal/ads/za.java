package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class za extends h72 implements xa {
    za(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void B() {
        b(5, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void G() {
        b(4, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void K() {
        b(8, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void M1() {
        b(18, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void W() {
        b(15, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void Z() {
        b(20, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(int i, String str) {
        Parcel r0 = r0();
        r0.writeInt(i);
        r0.writeString(str);
        b(22, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(s2 s2Var, String str) {
        Parcel r0 = r0();
        i72.a(r0, s2Var);
        r0.writeString(str);
        b(10, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(uh uhVar) {
        Parcel r0 = r0();
        i72.a(r0, uhVar);
        b(14, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(wh whVar) {
        Parcel r0 = r0();
        i72.a(r0, whVar);
        b(16, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(ya yaVar) {
        Parcel r0 = r0();
        i72.a(r0, yaVar);
        b(7, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void a(String str, String str2) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        b(9, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void c(Bundle bundle) {
        Parcel r0 = r0();
        i72.a(r0, bundle);
        b(19, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void d(int i) {
        Parcel r0 = r0();
        r0.writeInt(i);
        b(17, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void f(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(21, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void l() {
        b(1, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void o0() {
        b(11, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void s() {
        b(6, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void u(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(12, r0);
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void u0() {
        b(13, r0());
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void x() {
        b(2, r0());
    }
}
