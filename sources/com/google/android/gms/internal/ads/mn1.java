package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fn1;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class mn1<V> extends fn1<Object, V> {
    private on1<?> q;

    mn1(tl1<? extends lo1<?>> tl1, boolean z, Executor executor, Callable<V> callable) {
        super(tl1, z, false);
        this.q = new pn1(this, callable, executor);
        k();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fn1
    public final void a(int i, @NullableDecl Object obj) {
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fn1
    public final void a(fn1.a aVar) {
        super.a(aVar);
        if (aVar == fn1.a.OUTPUT_FUTURE_DONE) {
            this.q = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final void c() {
        on1<?> on1 = this.q;
        if (on1 != null) {
            on1.a();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.fn1
    public final void l() {
        on1<?> on1 = this.q;
        if (on1 != null) {
            on1.e();
        }
    }
}
