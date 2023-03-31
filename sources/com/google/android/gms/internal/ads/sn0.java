package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class sn0 {

    /* renamed from: a */
    private final Map<String, String> f4685a = new ConcurrentHashMap();

    /* renamed from: b */
    private final /* synthetic */ tn0 f4686b;

    sn0(tn0 tn0) {
        this.f4686b = tn0;
    }

    /* access modifiers changed from: public */
    private final sn0 c() {
        this.f4685a.putAll(this.f4686b.f4836c);
        return this;
    }

    public final sn0 a(id1 id1) {
        this.f4685a.put("aai", id1.t);
        return this;
    }

    public final sn0 a(kd1 kd1) {
        this.f4685a.put("gqi", kd1.f3376b);
        return this;
    }

    public final sn0 a(String str, String str2) {
        this.f4685a.put(str, str2);
        return this;
    }

    public final void a() {
        this.f4686b.f4835b.execute(new wn0(this));
    }

    public final /* synthetic */ void b() {
        this.f4686b.f4834a.a(this.f4685a);
    }
}
