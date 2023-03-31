package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* access modifiers changed from: package-private */
public abstract class on1<T> extends ho1<T> {
    private final Executor e;
    boolean f = true;
    private final /* synthetic */ mn1 g;

    on1(mn1 mn1, Executor executor) {
        this.g = mn1;
        jl1.a(executor);
        this.e = executor;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(T t);

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final void a(T t, Throwable th) {
        this.g.q = null;
        if (th == null) {
            a(t);
        } else if (th instanceof ExecutionException) {
            this.g.a(th.getCause());
        } else if (th instanceof CancellationException) {
            this.g.cancel(false);
        } else {
            this.g.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final boolean b() {
        return this.g.isDone();
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            this.e.execute(this);
        } catch (RejectedExecutionException e2) {
            if (this.f) {
                this.g.a((Throwable) e2);
            }
        }
    }
}
