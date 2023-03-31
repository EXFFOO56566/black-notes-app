package com.google.android.gms.internal.ads;

import java.util.Set;

public final class i11 implements r42<Set<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final b11 f3012a;

    public i11(b11 b11) {
        this.f3012a = b11;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<String> a2 = this.f3012a.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
