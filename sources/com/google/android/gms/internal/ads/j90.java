package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public class j90<ListenerT> {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private final Map<ListenerT, Executor> f3194b = new HashMap();

    protected j90(Set<ab0<ListenerT>> set) {
        a(set);
    }

    private final synchronized void a(Set<ab0<ListenerT>> set) {
        for (ab0<ListenerT> ab0 : set) {
            a(ab0);
        }
    }

    public final synchronized void a(ab0<ListenerT> ab0) {
        a(ab0.f1734a, ab0.f1735b);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(l90<ListenerT> l90) {
        for (Map.Entry<ListenerT, Executor> entry : this.f3194b.entrySet()) {
            entry.getValue().execute(new i90(l90, entry.getKey()));
        }
    }

    public final synchronized void a(ListenerT listenert, Executor executor) {
        this.f3194b.put(listenert, executor);
    }
}
