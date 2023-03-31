package com.google.android.gms.internal.ads;

import java.util.Map;

final class z4 implements d5<ws> {
    z4() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
    @Override // com.google.android.gms.internal.ads.d5
    public final /* synthetic */ void a(ws wsVar, Map map) {
        wsVar.c(!Boolean.parseBoolean((String) map.get("disabled")));
    }
}
