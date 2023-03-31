package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

public final class be0 implements r42<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<rf0> f1927a;

    public be0(e52<rf0> e52) {
        this.f1927a = e52;
    }

    public static Set<String> a(rf0 rf0) {
        Set<String> singleton = rf0.d() != null ? Collections.singleton("banner") : Collections.emptySet();
        y42.a(singleton, "Cannot return null from a non-@Nullable @Provides method");
        return singleton;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f1927a.get());
    }
}
