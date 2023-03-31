package com.google.android.gms.internal.ads;

import java.util.Map;

final class y4 implements d5<ws> {
    y4() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        ws wsVar2 = wsVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            wsVar2.K();
        } else if ("resume".equals(str)) {
            wsVar2.p();
        }
    }
}
