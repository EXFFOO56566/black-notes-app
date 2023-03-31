package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ik2;

public final class f11 implements r42<ik2.a> {

    /* renamed from: a  reason: collision with root package name */
    private final b11 f2518a;

    public f11(b11 b11) {
        this.f2518a = b11;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ik2.a c2 = this.f2518a.c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
