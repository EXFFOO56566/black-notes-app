package com.google.android.gms.internal.ads;

import java.util.Set;

public final class w60 implements r42<p60> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<q60>>> f5215a;

    private w60(e52<Set<ab0<q60>>> e52) {
        this.f5215a = e52;
    }

    public static w60 a(e52<Set<ab0<q60>>> e52) {
        return new w60(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new p60(this.f5215a.get());
    }
}
