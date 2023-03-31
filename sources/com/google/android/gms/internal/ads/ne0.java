package com.google.android.gms.internal.ads;

import org.json.JSONObject;

public final class ne0 implements r42<JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private final le0 f3835a;

    public ne0(le0 le0) {
        this.f3835a = le0;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        JSONObject a2 = this.f3835a.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
