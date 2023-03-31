package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.r.a;
import java.util.Set;

public final class ia0 implements r42<Set<ab0<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f3051a;

    private ia0(k90 k90) {
        this.f3051a = k90;
    }

    public static ia0 a(k90 k90) {
        return new ia0(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<a>> f = this.f3051a.f();
        y42.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }
}
