package com.google.android.gms.internal.ads;

import java.util.Set;

public final class h90 implements r42<x80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<g90>>> f2882a;

    private h90(e52<Set<ab0<g90>>> e52) {
        this.f2882a = e52;
    }

    public static h90 a(e52<Set<ab0<g90>>> e52) {
        return new h90(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new x80(this.f2882a.get());
    }
}
