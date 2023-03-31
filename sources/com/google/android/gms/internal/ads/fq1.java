package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bq1;
import java.util.Collections;
import java.util.Set;

final class fq1 implements bq1.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lp1 f2642a;

    fq1(lp1 lp1) {
        this.f2642a = lp1;
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final <Q> lp1<Q> a(Class<Q> cls) {
        if (this.f2642a.a().equals(cls)) {
            return this.f2642a;
        }
        throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Set<Class<?>> a() {
        return Collections.singleton(this.f2642a.a());
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final lp1<?> b() {
        return this.f2642a;
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Class<?> c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Class<?> d() {
        return this.f2642a.getClass();
    }
}
