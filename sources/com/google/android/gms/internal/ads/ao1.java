package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* access modifiers changed from: package-private */
public final class ao1<V> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Future<V> f1796b;

    /* renamed from: c  reason: collision with root package name */
    private final zn1<? super V> f1797c;

    ao1(Future<V> future, zn1<? super V> zn1) {
        this.f1796b = future;
        this.f1797c = zn1;
    }

    public final void run() {
        Throwable a2;
        Future<V> future = this.f1796b;
        if (!(future instanceof cp1) || (a2 = gp1.a((cp1) future)) == null) {
            try {
                this.f1797c.a(yn1.a((Future) this.f1796b));
            } catch (ExecutionException e) {
                this.f1797c.a(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.f1797c.a(e2);
            }
        } else {
            this.f1797c.a(a2);
        }
    }

    public final String toString() {
        dl1 a2 = bl1.a(this);
        a2.a(this.f1797c);
        return a2.toString();
    }
}
