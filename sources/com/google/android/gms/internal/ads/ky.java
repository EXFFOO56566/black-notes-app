package com.google.android.gms.internal.ads;

import java.util.Map;

public final class ky implements ly {

    /* renamed from: a  reason: collision with root package name */
    private yk f3467a;

    public ky(yk ykVar) {
        this.f3467a = ykVar;
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void a(Map<String, String> map) {
        this.f3467a.c(Boolean.parseBoolean(map.get("content_url_opted_out")));
    }
}
