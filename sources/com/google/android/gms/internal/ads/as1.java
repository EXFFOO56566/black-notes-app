package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class as1 extends qp1<ks1> {
    as1() {
        super(ks1.class, new zr1(wp1.class));
    }

    /* access modifiers changed from: private */
    public static void a(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    /* access modifiers changed from: private */
    public static void a(os1 os1) {
        if (os1.p() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (os1.p() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ ks1 a(dy1 dy1) {
        return ks1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(ks1 ks1) {
        ks1 ks12 = ks1;
        jx1.a(ks12.p(), 0);
        a(ks12.q().size());
        a(ks12.r());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.ns1, com.google.android.gms.internal.ads.ks1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, ks1> f() {
        return new cs1(this, ns1.class);
    }
}
