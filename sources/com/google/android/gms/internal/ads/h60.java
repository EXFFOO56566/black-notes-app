package com.google.android.gms.internal.ads;

import java.util.Set;

public final class h60 implements r42<g60> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<j60>>> f2868a;

    private h60(e52<Set<ab0<j60>>> e52) {
        this.f2868a = e52;
    }

    public static h60 a(e52<Set<ab0<j60>>> e52) {
        return new h60(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new g60(this.f2868a.get());
    }
}
