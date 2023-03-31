package com.google.android.gms.internal.ads;

import java.util.Map;

public final class o20<AdT> implements p20<AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, jt0<AdT>> f3933a;

    o20(Map<String, jt0<AdT>> map) {
        this.f3933a = map;
    }

    @Override // com.google.android.gms.internal.ads.p20
    public final jt0<AdT> a(int i, String str) {
        return this.f3933a.get(str);
    }
}
