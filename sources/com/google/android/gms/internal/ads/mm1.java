package com.google.android.gms.internal.ads;

final class mm1 extends ul1<Object> {
    private final transient Object[] d;
    private final transient int e;
    private final transient int f;

    mm1(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
        this.f = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jl1.a(i, this.f);
        return this.d[(i * 2) + this.e];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return true;
    }

    public final int size() {
        return this.f;
    }
}
