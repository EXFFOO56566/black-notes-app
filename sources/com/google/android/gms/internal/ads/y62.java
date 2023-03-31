package com.google.android.gms.internal.ads;

public final class y62 implements d2 {

    /* renamed from: a  reason: collision with root package name */
    private int f5542a;

    /* renamed from: b  reason: collision with root package name */
    private int f5543b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5544c;
    private final float d;

    public y62() {
        this(2500, 1, 1.0f);
    }

    private y62(int i, int i2, float f) {
        this.f5542a = 2500;
        this.f5544c = 1;
        this.d = 1.0f;
    }

    @Override // com.google.android.gms.internal.ads.d2
    public final int J() {
        return this.f5543b;
    }

    @Override // com.google.android.gms.internal.ads.d2
    public final void a(e3 e3Var) {
        boolean z = true;
        int i = this.f5543b + 1;
        this.f5543b = i;
        int i2 = this.f5542a;
        this.f5542a = i2 + ((int) (((float) i2) * this.d));
        if (i > this.f5544c) {
            z = false;
        }
        if (!z) {
            throw e3Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.d2
    public final int j0() {
        return this.f5542a;
    }
}
