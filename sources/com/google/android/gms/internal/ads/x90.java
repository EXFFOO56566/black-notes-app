package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.x.a;
import java.util.Set;

public final class x90 implements r42<Set<ab0<a>>> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f5388a;

    private x90(k90 k90) {
        this.f5388a = k90;
    }

    public static x90 a(k90 k90) {
        return new x90(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set<ab0<a>> e = this.f5388a.e();
        y42.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
