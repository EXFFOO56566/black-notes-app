package com.google.android.gms.internal.ads;

import java.util.Map;

final class a5 implements d5<ws> {
    a5() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        ws wsVar2 = wsVar;
        if (map.keySet().contains("start")) {
            wsVar2.e(true);
        }
        if (map.keySet().contains("stop")) {
            wsVar2.e(false);
        }
    }
}
