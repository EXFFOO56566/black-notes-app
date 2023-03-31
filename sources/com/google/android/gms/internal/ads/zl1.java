package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class zl1 extends ul1<E> {
    private final transient int d;
    private final transient int e;
    private final /* synthetic */ ul1 f;

    zl1(ul1 ul1, int i, int i2) {
        this.f = ul1;
        this.d = i;
        this.e = i2;
    }

    @Override // com.google.android.gms.internal.ads.ul1
    /* renamed from: a */
    public final ul1<E> subList(int i, int i2) {
        jl1.a(i, i2, this.e);
        ul1 ul1 = this.f;
        int i3 = this.d;
        return (ul1) ul1.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final Object[] b() {
        return this.f.b();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int d() {
        return this.f.d() + this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int e() {
        return this.f.d() + this.d + this.e;
    }

    @Override // java.util.List
    public final E get(int i) {
        jl1.a(i, this.e);
        return (E) this.f.get(i + this.d);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return true;
    }

    public final int size() {
        return this.e;
    }
}
