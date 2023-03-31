package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class o8 implements vo<r7> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w8 f3957a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f8 f3958b;

    o8(f8 f8Var, w8 w8Var) {
        this.f3958b = f8Var;
        this.f3957a = w8Var;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.vo
    public final /* synthetic */ void a(r7 r7Var) {
        synchronized (this.f3958b.f2551a) {
            this.f3958b.h = 0;
            if (!(this.f3958b.g == null || this.f3957a == this.f3958b.g)) {
                wk.e("New JS engine is loaded, marking previous one as destroyable.");
                this.f3958b.g.e();
            }
            this.f3958b.g = this.f3957a;
        }
    }
}
