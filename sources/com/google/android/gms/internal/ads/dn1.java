package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class dn1<I, O> extends zm1<I, O, ln1<? super I, ? extends O>, lo1<? extends O>> {
    dn1(lo1<? extends I> lo1, ln1<? super I, ? extends O> ln1) {
        super(lo1, ln1);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zm1
    public final /* synthetic */ Object a(Object obj, @NullableDecl Object obj2) {
        ln1 ln1 = (ln1) obj;
        lo1<O> a2 = ln1.a(obj2);
        jl1.a(a2, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ln1);
        return a2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zm1
    public final /* synthetic */ void b(Object obj) {
        a((lo1) ((lo1) obj));
    }
}
