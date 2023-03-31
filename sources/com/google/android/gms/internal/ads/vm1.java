package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* access modifiers changed from: package-private */
public final class vm1<V, X extends Throwable> extends wm1<V, X, ln1<? super X, ? extends V>, lo1<? extends V>> {
    vm1(lo1<? extends V> lo1, Class<X> cls, ln1<? super X, ? extends V> ln1) {
        super(lo1, cls, ln1);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wm1
    public final /* synthetic */ Object a(Object obj, Throwable th) {
        ln1 ln1 = (ln1) obj;
        lo1 a2 = ln1.a(th);
        jl1.a(a2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ln1);
        return a2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wm1
    public final /* synthetic */ void b(Object obj) {
        a((lo1) ((lo1) obj));
    }
}
