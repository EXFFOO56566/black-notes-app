package com.google.android.gms.auth.api.signin.internal;

import a.k.b.a;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.m;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class h extends a<Void> implements m {
    private Semaphore o = new Semaphore(0);
    private Set<f> p;

    public h(Context context, Set<f> set) {
        super(context);
        this.p = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Void t() {
        Iterator<f> it = this.p.iterator();
        if (!it.hasNext()) {
            try {
                this.o.tryAcquire(0, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
            }
            return null;
        }
        it.next().a(this);
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // a.k.b.b
    public final void l() {
        this.o.drainPermits();
        e();
    }
}
