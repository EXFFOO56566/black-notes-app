package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class es1 extends sp1<wp1, ju1> {
    es1(Class cls) {
        super(cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.sp1
    public final /* synthetic */ wp1 a(ju1 ju1) {
        ju1 ju12 = ju1;
        gu1 q = ju12.r().q();
        SecretKeySpec secretKeySpec = new SecretKeySpec(ju12.q().a(), "HMAC");
        int p = ju12.r().p();
        int i = hs1.f2972a[q.ordinal()];
        if (i == 1) {
            return new cx1("HMACSHA1", secretKeySpec, p);
        }
        if (i == 2) {
            return new cx1("HMACSHA256", secretKeySpec, p);
        }
        if (i == 3) {
            return new cx1("HMACSHA512", secretKeySpec, p);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
