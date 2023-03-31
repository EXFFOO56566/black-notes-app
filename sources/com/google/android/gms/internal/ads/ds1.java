package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ju1;
import java.security.GeneralSecurityException;

final class ds1 extends pp1<ku1, ju1> {
    ds1(bs1 bs1, Class cls) {
        super(cls);
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.c12' to match base method */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ ku1 a(dy1 dy1) {
        return ku1.a(dy1, dz1.a());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ void a(ku1 ku1) {
        ku1 ku12 = ku1;
        if (ku12.p() >= 16) {
            bs1.b(ku12.q());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.ads.c12] */
    @Override // com.google.android.gms.internal.ads.pp1
    public final /* synthetic */ ju1 b(ku1 ku1) {
        ku1 ku12 = ku1;
        ju1.a s = ju1.s();
        s.a(0);
        s.a(ku12.q());
        s.a(dy1.a(ex1.a(ku12.p())));
        return (ju1) ((rz1) s.e());
    }
}
