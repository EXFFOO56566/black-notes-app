package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class r8 implements to {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w8 f4454a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ f8 f4455b;

    r8(f8 f8Var, w8 w8Var) {
        this.f4455b = f8Var;
        this.f4454a = w8Var;
    }

    @Override // com.google.android.gms.internal.ads.to
    public final void run() {
        synchronized (this.f4455b.f2551a) {
            this.f4455b.h = 1;
            wk.e("Failed loading new engine. Marking new engine destroyable.");
            this.f4454a.e();
        }
    }
}
