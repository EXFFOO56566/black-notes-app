package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class zo1<V> extends sn1<V> implements RunnableFuture<V> {
    private volatile ho1<?> i;

    zo1(jn1<V> jn1) {
        this.i = new yo1(this, jn1);
    }

    private zo1(Callable<V> callable) {
        this.i = new bp1(this, callable);
    }

    static <V> zo1<V> a(Runnable runnable, @NullableDecl V v) {
        return new zo1<>(Executors.callable(runnable, v));
    }

    static <V> zo1<V> a(Callable<V> callable) {
        return new zo1<>(callable);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final void b() {
        ho1<?> ho1;
        super.b();
        if (e() && (ho1 = this.i) != null) {
            ho1.a();
        }
        this.i = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final String d() {
        ho1<?> ho1 = this.i;
        if (ho1 == null) {
            return super.d();
        }
        String valueOf = String.valueOf(ho1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
        sb.append("task=[");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void run() {
        ho1<?> ho1 = this.i;
        if (ho1 != null) {
            ho1.run();
        }
        this.i = null;
    }
}
