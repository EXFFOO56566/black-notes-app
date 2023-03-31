package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class b72<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f1883a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f1883a.containsKey(str)) {
                this.f1883a.put(str, new AtomicReference<>());
            }
        }
        return this.f1883a.get(str);
    }
}
