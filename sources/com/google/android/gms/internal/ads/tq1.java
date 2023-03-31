package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.at1;
import java.security.GeneralSecurityException;

final class tq1 extends pp1<dt1, at1> {
    tq1(rq1 rq1, Class cls) {
        super(cls);
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ dt1 a(dy1 dy1) {
        return dt1.a(dy1, dz1.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ void a(dt1 dt1) {
        dt1 dt12 = dt1;
        jx1.a(dt12.p());
        if (dt12.q().p() != 12 && dt12.q().p() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ at1 b(dt1 dt1) {
        dt1 dt12 = dt1;
        at1.a s = at1.s();
        s.a(dy1.a(ex1.a(dt12.p())));
        s.a(dt12.q());
        s.a(0);
        return (at1) ((rz1) s.e());
    }
}
