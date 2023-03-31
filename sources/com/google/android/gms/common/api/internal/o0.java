package com.google.android.gms.common.api.internal;

import b.c.b.a.c.d;
import b.c.b.a.h.g;
import com.google.android.gms.common.api.internal.f;

public final class o0 extends n0<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final j<?> f1583b;

    public o0(j<?> jVar, g<Boolean> gVar) {
        super(4, gVar);
        this.f1583b = jVar;
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public final /* bridge */ /* synthetic */ void a(t0 t0Var, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.u
    public final d[] b(f.a<?> aVar) {
        d0 d0Var = aVar.i().get(this.f1583b);
        if (d0Var == null) {
            return null;
        }
        return d0Var.f1559a.b();
    }

    @Override // com.google.android.gms.common.api.internal.u
    public final boolean c(f.a<?> aVar) {
        d0 d0Var = aVar.i().get(this.f1583b);
        return d0Var != null && d0Var.f1559a.c();
    }

    @Override // com.google.android.gms.common.api.internal.n0
    public final void d(f.a<?> aVar) {
        d0 remove = aVar.i().remove(this.f1583b);
        if (remove != null) {
            remove.f1560b.a(aVar.f(), this.f1582a);
            remove.f1559a.a();
            return;
        }
        this.f1582a.b((T) false);
    }
}
