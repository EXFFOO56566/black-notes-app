package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.a.d.b;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class v10 extends n00 {
    private final r3 g;
    private final Runnable h;
    private final Executor i;

    public v10(n20 n20, r3 r3Var, Runnable runnable, Executor executor) {
        super(n20);
        this.g = r3Var;
        this.h = runnable;
        this.i = executor;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void a(ViewGroup viewGroup, um2 um2) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        try {
            if (!this.g.A(b.a(runnable))) {
                runnable.run();
            }
        } catch (RemoteException unused) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.k20
    public final void b() {
        this.i.execute(new x10(this, new u10(new AtomicReference(this.h))));
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final rp2 f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final hd1 g() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final View h() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final hd1 i() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final int j() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.n00
    public final void k() {
    }
}
