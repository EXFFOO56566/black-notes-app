package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class hf2 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f2909a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f2910b;

    public final synchronized Map<String, String> a() {
        if (this.f2910b == null) {
            this.f2910b = Collections.unmodifiableMap(new HashMap(this.f2909a));
        }
        return this.f2910b;
    }
}
