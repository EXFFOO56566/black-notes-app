package com.google.android.gms.internal.ads;

import java.util.Map;

public final class sy implements ly {

    /* renamed from: a  reason: collision with root package name */
    private final yk f4723a;

    public sy(yk ykVar) {
        this.f4723a = ykVar;
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void a(Map<String, String> map) {
        String str = map.get("value");
        if ("auto_collect_location".equals(map.get("key"))) {
            this.f4723a.b(Boolean.parseBoolean(str));
        }
    }
}
