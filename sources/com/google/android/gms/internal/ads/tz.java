package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class tz implements r42<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<id1> f4883a;

    private tz(e52<id1> e52) {
        this.f4883a = e52;
    }

    public static tz a(e52<id1> e52) {
        return new tz(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return qz.a(this.f4883a.get());
    }
}
