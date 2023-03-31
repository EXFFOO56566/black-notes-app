package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class rq1 extends qp1<at1> {
    rq1() {
        super(at1.class, new uq1(fp1.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ at1 a(dy1 dy1) {
        return at1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(at1 at1) {
        at1 at12 = at1;
        jx1.a(at12.p(), 0);
        jx1.a(at12.q().size());
        if (at12.r().p() != 12 && at12.r().p() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.dt1, com.google.android.gms.internal.ads.at1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, at1> f() {
        return new tq1(this, dt1.class);
    }
}
