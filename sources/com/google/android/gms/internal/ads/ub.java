package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.mediation.s;
import com.google.android.gms.ads.s.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class ub extends fb {

    /* renamed from: b  reason: collision with root package name */
    private final s f4923b;

    public ub(s sVar) {
        this.f4923b = sVar;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final a C() {
        View a2 = this.f4923b.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final boolean E() {
        return this.f4923b.d();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final boolean F() {
        return this.f4923b.c();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void a(a aVar) {
        this.f4923b.c((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f4923b.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final String b() {
        return this.f4923b.l();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void b(a aVar) {
        this.f4923b.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final a c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final String d() {
        return this.f4923b.j();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void d(a aVar) {
        this.f4923b.b((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final v1 d0() {
        c.b n = this.f4923b.n();
        if (n != null) {
            return new i1(n.a(), n.d(), n.c(), n.e(), n.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final o1 e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final String f() {
        return this.f4923b.k();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final Bundle g() {
        return this.f4923b.b();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final rp2 getVideoController() {
        if (this.f4923b.e() != null) {
            return this.f4923b.e().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final List h() {
        List<c.b> m = this.f4923b.m();
        if (m == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (c.b bVar : m) {
            arrayList.add(new i1(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final void i() {
        this.f4923b.g();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final String q() {
        return this.f4923b.i();
    }

    @Override // com.google.android.gms.internal.ads.gb
    public final a w() {
        View h = this.f4923b.h();
        if (h == null) {
            return null;
        }
        return b.a(h);
    }
}
