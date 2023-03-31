package com.google.android.gms.internal.ads;

public final class gs extends wr {
    public gs(gq gqVar) {
        super(gqVar);
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final boolean a(String str) {
        gq gqVar = this.d.get();
        if (gqVar != null) {
            gqVar.a(b(str), this);
        }
        co.d("VideoStreamNoopCache is doing nothing.");
        a(str, b(str), "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void b() {
    }
}
