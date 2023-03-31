package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.rs1;

final class nq1 extends pp1<ss1, rs1> {
    nq1(mq1 mq1, Class cls) {
        super(cls);
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ ss1 a(dy1 dy1) {
        return ss1.a(dy1, dz1.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ void a(ss1 ss1) {
        ss1 ss12 = ss1;
        new qq1().f().a(ss12.p());
        new bs1().f().a(ss12.q());
        jx1.a(ss12.p().p());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ rs1 b(ss1 ss1) {
        ss1 ss12 = ss1;
        rs1.a s = rs1.s();
        s.a(new qq1().f().b(ss12.p()));
        s.a(new bs1().f().b(ss12.q()));
        s.a(0);
        return (rs1) ((rz1) s.e());
    }
}
