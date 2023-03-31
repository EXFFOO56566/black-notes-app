package com.google.android.gms.internal.ads;

import java.util.Set;

public final class bi1 implements r42<rh1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<zh1>>> f1955a;

    private bi1(e52<Set<ab0<zh1>>> e52) {
        this.f1955a = e52;
    }

    public static bi1 a(e52<Set<ab0<zh1>>> e52) {
        return new bi1(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new rh1(this.f1955a.get());
    }
}
