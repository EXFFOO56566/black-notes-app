package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;

public final class wq1 extends qp1<it1> {
    wq1() {
        super(it1.class, new vq1(fp1.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ it1 a(dy1 dy1) {
        return it1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(it1 it1) {
        it1 it12 = it1;
        jx1.a(it12.p(), 0);
        jx1.a(it12.q().size());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.jt1, com.google.android.gms.internal.ads.it1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, it1> f() {
        return new yq1(this, jt1.class);
    }
}
