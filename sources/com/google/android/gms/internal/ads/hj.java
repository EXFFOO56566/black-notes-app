package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

/* access modifiers changed from: package-private */
public final /* synthetic */ class hj implements qj {

    /* renamed from: a  reason: collision with root package name */
    static final qj f2923a = new hj();

    private hj() {
    }

    @Override // com.google.android.gms.internal.ads.qj
    public final Object a(ev evVar) {
        String y1 = evVar.y1();
        if (y1 != null) {
            return y1;
        }
        String T0 = evVar.T0();
        return T0 != null ? T0 : BuildConfig.FLAVOR;
    }
}
