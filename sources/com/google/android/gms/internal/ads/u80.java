package com.google.android.gms.internal.ads;

import java.util.Set;

public final class u80 implements r42<p80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<t80>>> f4912a;

    private u80(e52<Set<ab0<t80>>> e52) {
        this.f4912a = e52;
    }

    public static u80 a(e52<Set<ab0<t80>>> e52) {
        return new u80(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new p80(this.f4912a.get());
    }
}
