package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.au1;
import com.google.android.gms.internal.ads.xt1;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

final class pr1 extends pp1<tt1, xt1> {
    pr1(nr1 nr1, Class cls) {
        super(cls);
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ tt1 a(dy1 dy1) {
        return tt1.a(dy1, dz1.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ void a(tt1 tt1) {
        vr1.a(tt1.p());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ xt1 b(tt1 tt1) {
        tt1 tt12 = tt1;
        KeyPair a2 = mw1.a(mw1.a(vr1.a(tt12.p().p().p())));
        ECPoint w = ((ECPublicKey) a2.getPublic()).getW();
        au1.a t = au1.t();
        t.a(0);
        t.a(tt12.p());
        t.a(dy1.a(w.getAffineX().toByteArray()));
        t.b(dy1.a(w.getAffineY().toByteArray()));
        xt1.a s = xt1.s();
        s.a(0);
        s.a((au1) ((rz1) t.e()));
        s.a(dy1.a(((ECPrivateKey) a2.getPrivate()).getS().toByteArray()));
        return (xt1) ((rz1) s.e());
    }
}
