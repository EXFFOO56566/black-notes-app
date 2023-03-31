package com.google.android.gms.internal.ads;

import java.util.Set;

public final class o60 implements r42<m60> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<n60>>> f3953a;

    private o60(e52<Set<ab0<n60>>> e52) {
        this.f3953a = e52;
    }

    public static o60 a(e52<Set<ab0<n60>>> e52) {
        return new o60(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new m60(this.f3953a.get());
    }
}
