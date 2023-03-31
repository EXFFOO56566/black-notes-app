package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.d.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

final class p00 extends n00 {
    private final Context g;
    private final View h;
    private final ws i;
    private final hd1 j;
    private final l20 k;
    private final rf0 l;
    private final eb0 m;
    private final l42<kz0> n;
    private final Executor o;
    private um2 p;

    p00(n20 n20, Context context, hd1 hd1, View view, ws wsVar, l20 l20, rf0 rf0, eb0 eb0, l42<kz0> l42, Executor executor) {
        super(n20);
        this.g = context;
        this.h = view;
        this.i = wsVar;
        this.j = hd1;
        this.k = l20;
        this.l = rf0;
        this.m = eb0;
        this.n = l42;
        this.o = executor;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void a(ViewGroup viewGroup, um2 um2) {
        ws wsVar;
        if (viewGroup != null && (wsVar = this.i) != null) {
            wsVar.a(lu.a(um2));
            viewGroup.setMinimumHeight(um2.d);
            viewGroup.setMinimumWidth(um2.g);
            this.p = um2;
        }
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void b() {
        this.o.execute(new o00(this));
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final rp2 f() {
        try {
            return this.k.getVideoController();
        } catch (fe1 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final hd1 g() {
        boolean z;
        um2 um2 = this.p;
        if (um2 != null) {
            return ce1.a(um2);
        }
        id1 id1 = this.f3309b;
        if (id1.T) {
            Iterator<String> it = id1.f3066a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new hd1(this.h.getWidth(), this.h.getHeight(), false);
            }
        }
        return ce1.a(this.f3309b.o, this.j);
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final View h() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final hd1 i() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final int j() {
        return this.f3308a.f5093b.f4642b.f3377c;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void k() {
        this.m.R();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        if (this.l.d() != null) {
            try {
                this.l.d().a(this.n.get(), b.a(this.g));
            } catch (RemoteException e) {
                co.b("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
