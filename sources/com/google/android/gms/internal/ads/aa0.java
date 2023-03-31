package com.google.android.gms.internal.ads;

import java.util.Set;

public final class aa0 implements r42<Set<ab0<q70>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f1731a;

    private aa0(k90 k90) {
        this.f1731a = k90;
    }

    public static aa0 a(k90 k90) {
        return new aa0(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<q70>> i = this.f1731a.i();
        y42.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }
}
