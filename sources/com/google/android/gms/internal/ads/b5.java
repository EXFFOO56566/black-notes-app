package com.google.android.gms.internal.ads;

import java.util.Map;

final class b5 implements d5<ws> {
    b5() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        ws wsVar2 = wsVar;
        if (map.keySet().contains("start")) {
            wsVar2.P().c();
        } else if (map.keySet().contains("stop")) {
            wsVar2.P().h();
        } else if (map.keySet().contains("cancel")) {
            wsVar2.P().e();
        }
    }
}
