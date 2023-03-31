package com.google.android.gms.internal.ads;

public final class rr implements es {
    @Override // com.google.android.gms.internal.ads.es
    public final wr a(gq gqVar, int i, String str, hq hqVar) {
        if (i <= 0) {
            return new hs(gqVar);
        }
        int g = er.g();
        return g < hqVar.g ? new ms(gqVar, hqVar) : g < hqVar.f2963b ? new is(gqVar, hqVar) : new gs(gqVar);
    }
}
