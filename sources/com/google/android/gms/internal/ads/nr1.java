package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ou1;
import java.security.GeneralSecurityException;

public final class nr1 extends cq1<xt1, au1> {
    nr1() {
        super(xt1.class, au1.class, new mr1(jp1.class));
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ c12 a(dy1 dy1) {
        return xt1.a(dy1, dz1.a());
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final /* synthetic */ void a(c12 c12) {
        xt1 xt1 = (xt1) c12;
        if (!xt1.q().isEmpty()) {
            jx1.a(xt1.p(), 0);
            vr1.a(xt1.r().q());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final ou1.b c() {
        return ou1.b.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final pp1<tt1, xt1> f() {
        return new pr1(this, tt1.class);
    }
}
