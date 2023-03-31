package com.google.android.gms.internal.ads;

import java.util.Set;

public final class u90 implements r42<Set<ab0<a60>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f4918a;

    private u90(k90 k90) {
        this.f4918a = k90;
    }

    public static u90 a(k90 k90) {
        return new u90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<a60>> c2 = this.f4918a.c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
