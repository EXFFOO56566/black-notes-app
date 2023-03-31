package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.bq1;
import java.security.GeneralSecurityException;
import java.util.Set;

final class dq1 implements bq1.a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ qp1 f2296a;

    dq1(qp1 qp1) {
        this.f2296a = qp1;
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final <Q> lp1<Q> a(Class<Q> cls) {
        try {
            return new op1(this.f2296a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Set<Class<?>> a() {
        return this.f2296a.d();
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final lp1<?> b() {
        qp1 qp1 = this.f2296a;
        return new op1(qp1, qp1.e());
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Class<?> c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.bq1.a
    public final Class<?> d() {
        return this.f2296a.getClass();
    }
}
