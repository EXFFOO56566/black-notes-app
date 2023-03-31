package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class yo1 extends ho1<lo1<V>> {
    private final jn1<V> e;
    private final /* synthetic */ zo1 f;

    yo1(zo1 zo1, jn1<V> jn1) {
        this.f = zo1;
        jl1.a(jn1);
        this.e = jn1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final /* synthetic */ void a(Object obj, Throwable th) {
        lo1 lo1 = (lo1) obj;
        if (th == null) {
            this.f.a(lo1);
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
    public final /* synthetic */ Object c() {
        lo1<V> a2 = this.e.a();
        jl1.a(a2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.e);
        return a2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.ho1
    public final String d() {
        return this.e.toString();
    }
}
