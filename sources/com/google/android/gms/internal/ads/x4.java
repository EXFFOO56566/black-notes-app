package com.google.android.gms.internal.ads;

import java.util.Map;

final class x4 implements d5<Object> {
    x4() {
    }

    @Override // com.google.android.gms.internal.ads.d5
    public final void a(Object obj, Map<String, String> map) {
        String valueOf = String.valueOf(map.get("string"));
        co.c(valueOf.length() != 0 ? "Received log message: ".concat(valueOf) : new String("Received log message: "));
    }
}
