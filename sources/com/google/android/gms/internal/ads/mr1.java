package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

final class mr1 extends sp1<jp1, xt1> {
    mr1(Class cls) {
        super(cls);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.sp1
    public final /* synthetic */ jp1 a(xt1 xt1) {
        xt1 xt12 = xt1;
        wt1 q = xt12.r().q();
        bu1 p = q.p();
        ow1 a2 = vr1.a(p.p());
        byte[] a3 = xt12.q().a();
        return new iw1((ECPrivateKey) tw1.j.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, a3), mw1.a(a2))), p.r().a(), vr1.a(p.q()), vr1.a(q.r()), new xr1(q.q().p()));
    }
}
