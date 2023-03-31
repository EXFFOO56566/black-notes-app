package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class yn0 implements zh1 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<ph1, Long> f5618b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final rn0 f5619c;
    private final d d;
    private final Map<ph1, xn0> e = new HashMap();

    public yn0(rn0 rn0, Set<xn0> set, d dVar) {
        this.f5619c = rn0;
        for (xn0 xn0 : set) {
            this.e.put(xn0.f5468c, xn0);
        }
        this.d = dVar;
    }

    private final void a(ph1 ph1, boolean z) {
        ph1 ph12 = this.e.get(ph1).f5467b;
        String str = z ? "s." : "f.";
        if (this.f5618b.containsKey(ph12)) {
            long b2 = this.d.b() - this.f5618b.get(ph12).longValue();
            Map<String, String> a2 = this.f5619c.a();
            String valueOf = String.valueOf(this.e.get(ph1).f5466a);
            String concat = valueOf.length() != 0 ? "label.".concat(valueOf) : new String("label.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void a(ph1 ph1, String str, Throwable th) {
        if (this.f5618b.containsKey(ph1)) {
            long b2 = this.d.b() - this.f5618b.get(ph1).longValue();
            Map<String, String> a2 = this.f5619c.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? "f.".concat(valueOf2) : new String("f."));
        }
        if (this.e.containsKey(ph1)) {
            a(ph1, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void b(ph1 ph1, String str) {
        this.f5618b.put(ph1, Long.valueOf(this.d.b()));
    }

    @Override // com.google.android.gms.internal.ads.zh1
    public final void c(ph1 ph1, String str) {
        if (this.f5618b.containsKey(ph1)) {
            long b2 = this.d.b() - this.f5618b.get(ph1).longValue();
            Map<String, String> a2 = this.f5619c.a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b2));
            a2.put(concat, valueOf2.length() != 0 ? "s.".concat(valueOf2) : new String("s."));
        }
        if (this.e.containsKey(ph1)) {
            a(ph1, true);
        }
    }
}
