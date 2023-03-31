package com.google.android.gms.internal.ads;

import java.util.Set;

public final class y90 implements r42<Set<ab0<l70>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f5556a;

    private y90(k90 k90) {
        this.f5556a = k90;
    }

    public static y90 a(k90 k90) {
        return new y90(k90);
    }

    public static Set<ab0<l70>> b(k90 k90) {
        Set<ab0<l70>> b2 = k90.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f5556a);
    }
}
