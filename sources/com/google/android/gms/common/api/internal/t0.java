package com.google.android.gms.common.api.internal;

import b.c.b.a.h.g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<BasePendingResult<?>, Boolean> f1591a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Map<g<?>, Boolean> f1592b = Collections.synchronizedMap(new WeakHashMap());

    private final void a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f1591a) {
            hashMap = new HashMap(this.f1591a);
        }
        synchronized (this.f1592b) {
            hashMap2 = new HashMap(this.f1592b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).b(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((g) entry2.getKey()).b((Exception) new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(BasePendingResult<? extends k> basePendingResult, boolean z) {
        this.f1591a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.a((g.a) new q(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return !this.f1591a.isEmpty() || !this.f1592b.isEmpty();
    }

    public final void b() {
        a(false, f.o);
    }

    public final void c() {
        a(true, k0.f1580a);
    }
}
