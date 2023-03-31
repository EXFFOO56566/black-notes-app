package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class js {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<bf2> f3270a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f3271b;

    js() {
    }

    /* access modifiers changed from: package-private */
    public final long a() {
        Iterator<bf2> it = this.f3270a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> a2 = it.next().a();
            if (a2 != null) {
                for (Map.Entry<String, List<String>> entry : a2.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f3271b = Math.max(this.f3271b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f3271b;
    }

    /* access modifiers changed from: package-private */
    public final void a(bf2 bf2) {
        this.f3270a.add(bf2);
    }
}
