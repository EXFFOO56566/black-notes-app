package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class xq1 extends qp1<mt1> {
    xq1() {
        super(mt1.class, new ar1(fp1.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ mt1 a(dy1 dy1) {
        return mt1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(mt1 mt1) {
        mt1 mt12 = mt1;
        jx1.a(mt12.p(), 0);
        if (mt12.q().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.nt1, com.google.android.gms.internal.ads.mt1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, mt1> f() {
        return new zq1(this, nt1.class);
    }
}
