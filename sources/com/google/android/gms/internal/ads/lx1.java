package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class lx1 implements cj2 {

    /* renamed from: a */
    private final Map<String, List<gh2<?>>> f3618a = new HashMap();

    /* renamed from: b */
    private final lf0 f3619b;

    lx1(lf0 lf0) {
        this.f3619b = lf0;
    }

    /* access modifiers changed from: public */
    private final synchronized boolean b(gh2<?> gh2) {
        String j = gh2.j();
        if (this.f3618a.containsKey(j)) {
            List<gh2<?>> list = this.f3618a.get(j);
            if (list == null) {
                list = new ArrayList<>();
            }
            gh2.a("waiting-for-response");
            list.add(gh2);
            this.f3618a.put(j, list);
            if (c5.f2060b) {
                c5.a("Request for cacheKey=%s is in flight, putting on hold.", j);
            }
            return true;
        }
        this.f3618a.put(j, null);
        gh2.a((cj2) this);
        if (c5.f2060b) {
            c5.a("new request, sending to network %s", j);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.cj2
    public final synchronized void a(gh2<?> gh2) {
        String j = gh2.j();
        List<gh2<?>> remove = this.f3618a.remove(j);
        if (remove != null && !remove.isEmpty()) {
            if (c5.f2060b) {
                c5.c("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), j);
            }
            gh2<?> remove2 = remove.remove(0);
            this.f3618a.put(j, remove);
            remove2.a((cj2) this);
            try {
                this.f3619b.f3539c.put(remove2);
            } catch (InterruptedException e) {
                c5.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.f3619b.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cj2
    public final void a(gh2<?> gh2, ar2<?> ar2) {
        List<gh2<?>> remove;
        m61 m61 = ar2.f1807b;
        if (m61 == null || m61.a()) {
            a(gh2);
            return;
        }
        String j = gh2.j();
        synchronized (this) {
            remove = this.f3618a.remove(j);
        }
        if (remove != null) {
            if (c5.f2060b) {
                c5.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), j);
            }
            for (gh2<?> gh22 : remove) {
                this.f3619b.e.a(gh22, ar2);
            }
        }
    }
}
