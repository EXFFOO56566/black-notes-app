package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class qq1 extends qp1<vs1> {
    qq1() {
        super(vs1.class, new pq1(dx1.class));
    }

    /* access modifiers changed from: private */
    public static void a(zs1 zs1) {
        if (zs1.p() < 12 || zs1.p() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ vs1 a(dy1 dy1) {
        return vs1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(vs1 vs1) {
        vs1 vs12 = vs1;
        jx1.a(vs12.p(), 0);
        jx1.a(vs12.q().size());
        a(vs12.r());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.ws1, com.google.android.gms.internal.ads.vs1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, vs1> f() {
        return new sq1(this, ws1.class);
    }
}
