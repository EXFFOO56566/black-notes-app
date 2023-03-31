package com.google.android.gms.internal.ads;

import java.util.Set;

public final class g21 implements r42<e21> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<String>> f2696a;

    private g21(e52<Set<String>> e52) {
        this.f2696a = e52;
    }

    public static e21 a(Set<String> set) {
        return new e21(set);
    }

    public static g21 a(e52<Set<String>> e52) {
        return new g21(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2696a.get());
    }
}
