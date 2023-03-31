package com.google.android.gms.internal.ads;

public class cx0 extends gy0 {
    private lb0 k;

    public cx0(t50 t50, m60 m60, v60 v60, g70 g70, c60 c60, w80 w80, qb0 qb0, t70 t70, lb0 lb0, p80 p80) {
        super(t50, m60, v60, g70, w80, t70, qb0, p80, c60);
        this.k = lb0;
    }

    @Override // com.google.android.gms.internal.ads.xa, com.google.android.gms.internal.ads.gy0
    public final void M1() {
        this.k.z();
    }

    @Override // com.google.android.gms.internal.ads.xa, com.google.android.gms.internal.ads.gy0
    public final void a(uh uhVar) {
        super.a(uhVar);
        this.k.a(uhVar);
    }

    @Override // com.google.android.gms.internal.ads.xa, com.google.android.gms.internal.ads.gy0
    public final void a(wh whVar) {
        super.a(whVar);
        this.k.a(new uh(whVar.m(), whVar.I()));
    }

    @Override // com.google.android.gms.internal.ads.xa, com.google.android.gms.internal.ads.gy0
    public final void o0() {
        this.k.z();
    }

    @Override // com.google.android.gms.internal.ads.xa, com.google.android.gms.internal.ads.gy0
    public final void u0() {
        this.k.j();
    }
}
