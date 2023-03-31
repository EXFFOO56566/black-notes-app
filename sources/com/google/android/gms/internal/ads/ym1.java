package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class ym1<V, X extends Throwable> extends wm1<V, X, xk1<? super X, ? extends V>, V> {
    ym1(lo1<? extends V> lo1, Class<X> cls, xk1<? super X, ? extends V> xk1) {
        super(lo1, cls, xk1);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wm1
    @NullableDecl
    public final /* synthetic */ Object a(Object obj, Throwable th) {
        return ((xk1) obj).a(th);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.wm1
    public final void b(@NullableDecl V v) {
        a((Object) v);
    }
}
