package com.google.android.gms.internal.ads;

import android.view.View;

public final class h00 extends k20 {
    private final View g;
    private final ws h;
    private final hd1 i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private wi2 m;
    private final yz n;

    h00(n20 n20, View view, ws wsVar, hd1 hd1, int i2, boolean z, boolean z2, yz yzVar) {
        super(n20);
        this.g = view;
        this.h = wsVar;
        this.i = hd1;
        this.j = i2;
        this.k = z;
        this.l = z2;
        this.n = yzVar;
    }

    public final void a(long j2) {
        this.n.a(j2);
    }

    public final void a(pi2 pi2) {
        ws wsVar = this.h;
        if (wsVar != null) {
            wsVar.a(pi2);
        }
    }

    public final void a(wi2 wi2) {
        this.m = wi2;
    }

    public final boolean f() {
        ws wsVar = this.h;
        return (wsVar == null || wsVar.P() == null || !this.h.P().f()) ? false : true;
    }

    public final int g() {
        return this.j;
    }

    public final boolean h() {
        return this.k;
    }

    public final boolean i() {
        return this.l;
    }

    public final hd1 j() {
        return ce1.a(this.f3309b.o, this.i);
    }

    public final View k() {
        return this.g;
    }

    public final boolean l() {
        ws wsVar = this.h;
        return wsVar != null && wsVar.k();
    }

    public final wi2 m() {
        return this.m;
    }
}
