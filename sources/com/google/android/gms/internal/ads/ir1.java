package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class ir1 extends qp1<ov1> {
    ir1() {
        super(ov1.class, new lr1(fp1.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ ov1 a(dy1 dy1) {
        return ov1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(ov1 ov1) {
        ov1 ov12 = ov1;
        jx1.a(ov12.p(), 0);
        if (ov12.q().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.rv1, com.google.android.gms.internal.ads.ov1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, ov1> f() {
        return new kr1(this, rv1.class);
    }
}
