package com.google.android.gms.internal.ads;

import java.util.Set;

public final class o90 implements r42<y50> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f3965a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Set<ab0<a60>>> f3966b;

    private o90(k90 k90, e52<Set<ab0<a60>>> e52) {
        this.f3965a = k90;
        this.f3966b = e52;
    }

    public static o90 a(k90 k90, e52<Set<ab0<a60>>> e52) {
        return new o90(k90, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        y50 a2 = this.f3965a.a(this.f3966b.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
