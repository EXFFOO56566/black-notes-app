package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.mediation.w;
import com.google.android.gms.ads.s.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class bc extends kb {

    /* renamed from: b  reason: collision with root package name */
    private final w f1917b;

    public bc(w wVar) {
        this.f1917b = wVar;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final a C() {
        View a2 = this.f1917b.a();
        if (a2 == null) {
            return null;
        }
        return b.a(a2);
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final boolean E() {
        return this.f1917b.m();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final boolean F() {
        return this.f1917b.l();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final float L0() {
        return this.f1917b.k();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final void a(a aVar) {
        this.f1917b.b((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final void a(a aVar, a aVar2, a aVar3) {
        this.f1917b.a((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final String b() {
        return this.f1917b.h();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final void b(a aVar) {
        this.f1917b.a((View) b.Q(aVar));
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final a c() {
        Object u = this.f1917b.u();
        if (u == null) {
            return null;
        }
        return b.a(u);
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final String d() {
        return this.f1917b.c();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final o1 e() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final String f() {
        return this.f1917b.d();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final Bundle g() {
        return this.f1917b.g();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final float g1() {
        return this.f1917b.e();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final rp2 getVideoController() {
        if (this.f1917b.q() != null) {
            return this.f1917b.q().a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final List h() {
        List<c.b> j = this.f1917b.j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (c.b bVar : j) {
                arrayList.add(new i1(bVar.a(), bVar.d(), bVar.c(), bVar.e(), bVar.b()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final void i() {
        this.f1917b.s();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final double k() {
        if (this.f1917b.o() != null) {
            return this.f1917b.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final String o() {
        return this.f1917b.n();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final String q() {
        return this.f1917b.b();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final String r() {
        return this.f1917b.p();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final float r1() {
        return this.f1917b.f();
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final v1 t() {
        c.b i = this.f1917b.i();
        if (i != null) {
            return new i1(i.a(), i.d(), i.c(), i.e(), i.b());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final a w() {
        View t = this.f1917b.t();
        if (t == null) {
            return null;
        }
        return b.a(t);
    }
}
