package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bq1;
import java.security.GeneralSecurityException;
import java.util.Set;

final class hq1 implements bq1.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ cq1 f2965a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ qp1 f2966b;

    hq1(cq1 cq1, qp1 qp1) {
        this.f2965a = cq1;
        this.f2966b = qp1;
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final <Q> lp1<Q> a(Class<Q> cls) {
        try {
            return new zp1(this.f2965a, this.f2966b, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Set<Class<?>> a() {
        return this.f2965a.d();
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final lp1<?> b() {
        cq1 cq1 = this.f2965a;
        return new zp1(cq1, this.f2966b, cq1.e());
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Class<?> c() {
        return this.f2966b.getClass();
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Class<?> d() {
        return this.f2965a.getClass();
    }
}
