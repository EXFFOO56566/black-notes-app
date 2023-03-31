package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;

public final class mq1 extends qp1<rs1> {
    mq1() {
        super(rs1.class, new oq1(fp1.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ rs1 a(dy1 dy1) {
        return rs1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(rs1 rs1) {
        jx1.a(rs1.p(), 0);
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.ss1, com.google.android.gms.internal.ads.rs1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, rs1> f() {
        return new nq1(this, ss1.class);
    }
}
