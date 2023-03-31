package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class pf0 implements r42<nf0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<id1> f4160a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<JSONObject> f4161b;

    public pf0(e52<id1> e52, e52<JSONObject> e522) {
        this.f4160a = e52;
        this.f4161b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new nf0(this.f4160a.get(), this.f4161b.get());
    }
}
