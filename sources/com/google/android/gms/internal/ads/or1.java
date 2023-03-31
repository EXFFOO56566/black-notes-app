package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;

final class or1 extends qp1<au1> {
    public or1() {
        super(au1.class, new rr1(mp1.class));
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ au1 a(dy1 dy1) {
        return au1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(au1 au1) {
        au1 au12 = au1;
        jx1.a(au12.p(), 0);
        vr1.a(au12.q());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.ASYMMETRIC_PUBLIC;
    }
}
