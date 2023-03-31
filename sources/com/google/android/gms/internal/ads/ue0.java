package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import org.json.JSONObject;

public final class ue0 implements r42<ah2> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<fo> f4937a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<String> f4938b;

    public ue0(e52<fo> e52, e52<String> e522) {
        this.f4937a = e52;
        this.f4938b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        q.c();
        ah2 ah2 = new ah2(gl.b(), this.f4937a.get(), this.f4938b.get(), new JSONObject(), false, true);
        y42.a(ah2, "Cannot return null from a non-@Nullable @Provides method");
        return ah2;
    }
}
