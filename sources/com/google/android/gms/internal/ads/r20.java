package com.google.android.gms.internal.ads;

import java.util.Map;

public final class r20<AdT> implements r42<o20<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Map<String, jt0<AdT>>> f4431a;

    private r20(e52<Map<String, jt0<AdT>>> e52) {
        this.f4431a = e52;
    }

    public static <AdT> r20<AdT> a(e52<Map<String, jt0<AdT>>> e52) {
        return new r20<>(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new o20(this.f4431a.get());
    }
}
