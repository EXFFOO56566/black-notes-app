package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.mediation.r;
import com.google.android.gms.ads.s.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class rb extends eb {

    /* renamed from: b  reason: collision with root package name */
    private final r f4471b;

    public rb(r rVar) {
        this.f4471b = rVar;
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final a C() {
        View a2 = this.f4471b.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final boolean E() {
        return this.f4471b.d();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final boolean F() {
        return this.f4471b.c();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final void a(a aVar) {
        this.f4471b.c((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f4471b.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final String b() {
        return this.f4471b.k();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final void b(a aVar) {
        this.f4471b.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final a c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final String d() {
        return this.f4471b.i();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final void d(a aVar) {
        this.f4471b.b((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final o1 e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final String f() {
        return this.f4471b.j();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final Bundle g() {
        return this.f4471b.b();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final rp2 getVideoController() {
        if (this.f4471b.e() != null) {
            return this.f4471b.e().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final List h() {
        List<c.b> m = this.f4471b.m();
        if (m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : m) {
            arrayList.add(new i1(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final void i() {
        this.f4471b.g();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final double k() {
        return this.f4471b.o();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final String o() {
        return this.f4471b.n();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final String r() {
        return this.f4471b.p();
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final v1 t() {
        c.b l = this.f4471b.l();
        if (l != null) {
            return new i1(l.a(), l.d(), l.c(), l.e(), l.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ab
    public final a w() {
        View h = this.f4471b.h();
        if (h == null) {
            return null;
        }
        return b.a(h);
    }
}
