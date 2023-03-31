package com.google.android.gms.internal.ads;

import java.util.Set;

public final class w00 implements r42<g70> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f5189a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Set<ab0<l70>>> f5190b;

    public w00(r00 r00, e52<Set<ab0<l70>>> e52) {
        this.f5189a = r00;
        this.f5190b = e52;
    }

    public static g70 a(r00 r00, Set<ab0<l70>> set) {
        g70 a2 = r00.a(set);
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5189a, this.f5190b.get());
    }
}
