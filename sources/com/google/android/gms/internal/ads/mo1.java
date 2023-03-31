package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* access modifiers changed from: package-private */
public final class mo1 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    boolean f3740b = true;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Executor f3741c;
    private final /* synthetic */ xm1 d;

    mo1(Executor executor, xm1 xm1) {
        this.f3741c = executor;
        this.d = xm1;
    }

    public final void execute(Runnable runnable) {
        try {
            this.f3741c.execute(new po1(this, runnable));
        } catch (RejectedExecutionException e) {
            if (this.f3740b) {
                this.d.a((Throwable) e);
            }
        }
    }
}
