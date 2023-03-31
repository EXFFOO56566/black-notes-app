package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class bs1 extends qp1<ju1> {
    public bs1() {
        super(ju1.class, new es1(wp1.class));
    }

    /* access modifiers changed from: private */
    public static void a(nu1 nu1) {
        if (nu1.p() >= 10) {
            int i = hs1.f2972a[nu1.q().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (nu1.p() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (nu1.p() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (nu1.p() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ ju1 a(dy1 dy1) {
        return ju1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(ju1 ju1) {
        ju1 ju12 = ju1;
        jx1.a(ju12.p(), 0);
        if (ju12.q().size() >= 16) {
            a(ju12.r());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.SYMMETRIC;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.pp1<com.google.android.gms.internal.ads.ku1, com.google.android.gms.internal.ads.ju1>' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<?, ju1> f() {
        return new ds1(this, ku1.class);
    }
}
