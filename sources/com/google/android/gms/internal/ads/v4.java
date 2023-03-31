package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.c;
import java.util.Map;

final class v4 implements d5<ws> {
    v4() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        ws wsVar2 = wsVar;
        if (wsVar2.r() != null) {
            wsVar2.r().v0();
        }
        c M = wsVar2.M();
        if (M != null) {
            M.b2();
            return;
        }
        c q = wsVar2.q();
        if (q != null) {
            q.b2();
        } else {
            co.d("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
