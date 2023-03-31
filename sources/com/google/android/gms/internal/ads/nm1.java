package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class nm1<E> extends cm1<E> {
    private final transient E d;
    private transient int e;

    nm1(E e2) {
        jl1.a(e2);
        this.d = e2;
    }

    nm1(E e2, int i) {
        this.d = e2;
        this.e = i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int a(Object[] objArr, int i) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.tl1
    /* renamed from: a */
    public final qm1<E> iterator() {
        return new em1(this.d);
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.cm1
    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = this.d.hashCode();
        this.e = hashCode;
        return hashCode;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.cm1
    public final boolean k() {
        return this.e != 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.cm1
    public final ul1<E> l() {
        return ul1.a((Object) this.d);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
