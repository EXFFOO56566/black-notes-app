package com.google.android.gms.internal.ads;

import java.util.Set;

public final class i70 implements r42<g70> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Set<ab0<l70>>> f3039a;

    private i70(e52<Set<ab0<l70>>> e52) {
        this.f3039a = e52;
    }

    public static i70 a(e52<Set<ab0<l70>>> e52) {
        return new i70(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new g70(this.f3039a.get());
    }
}
