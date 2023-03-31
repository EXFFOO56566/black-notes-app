package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class bp1 extends ho1<V> {
    private final Callable<V> e;
    private final /* synthetic */ zo1 f;

    bp1(zo1 zo1, Callable<V> callable) {
        this.f = zo1;
        jl1.a(callable);
        this.e = callable;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final void a(V v, Throwable th) {
        if (th == null) {
            this.f.a((Object) v);
        } else {
            this.f.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final boolean b() {
        return this.f.isDone();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final V c() {
        return this.e.call();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final String d() {
        return this.e.toString();
    }
}
