package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class fm1<E> extends ul1<E> {
    static final ul1<Object> f = new fm1(new Object[0], 0);
    private final transient Object[] d;
    private final transient int e;

    fm1(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1, com.google.android.gms.internal.ads.ul1
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final Object[] b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int e() {
        return this.e;
    }

    @Override // java.util.List
    public final E get(int i) {
        jl1.a(i, this.e);
        return (E) this.d[i];
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return false;
    }

    public final int size() {
        return this.e;
    }
}
