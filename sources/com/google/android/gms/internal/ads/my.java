package com.google.android.gms.internal.ads;

import java.util.Map;

public final class my implements ly {

    /* renamed from: a  reason: collision with root package name */
    private yk f3767a;

    public my(yk ykVar) {
        this.f3767a = ykVar;
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void a(Map<String, String> map) {
        this.f3767a.a(Boolean.parseBoolean(map.get("content_vertical_opted_out")));
    }
}
