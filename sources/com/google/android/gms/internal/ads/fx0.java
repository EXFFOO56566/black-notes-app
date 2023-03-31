package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

public final class fx0 implements kt0<le1, tu0> {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, lt0<le1, tu0>> f2670a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final rl0 f2671b;

    public fx0(rl0 rl0) {
        this.f2671b = rl0;
    }

    @Override // com.google.android.gms.internal.ads.kt0
    public final lt0<le1, tu0> a(String str, JSONObject jSONObject) {
        synchronized (this) {
            lt0<le1, tu0> lt0 = this.f2670a.get(str);
            if (lt0 == null) {
                le1 a2 = this.f2671b.a(str, jSONObject);
                if (a2 == null) {
                    return null;
                }
                lt0 = new lt0<>(a2, new tu0(), str);
                this.f2670a.put(str, lt0);
            }
            return lt0;
        }
    }
}
