package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

public final class kz implements r42<ah2> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<id1> f3468a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f3469b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<JSONObject> f3470c;
    private final e52<String> d;

    private kz(e52<id1> e52, e52<fo> e522, e52<JSONObject> e523, e52<String> e524) {
        this.f3468a = e52;
        this.f3469b = e522;
        this.f3470c = e523;
        this.d = e524;
    }

    public static kz a(e52<id1> e52, e52<fo> e522, e52<JSONObject> e523, e52<String> e524) {
        return new kz(e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        this.f3468a.get();
        fo foVar = this.f3469b.get();
        JSONObject jSONObject = this.f3470c.get();
        String str = this.d.get();
        boolean equals = "native".equals(str);
        q.c();
        ah2 ah2 = new ah2(gl.b(), foVar, str, jSONObject, false, equals);
        y42.a(ah2, "Cannot return null from a non-@Nullable @Provides method");
        return ah2;
    }
}
