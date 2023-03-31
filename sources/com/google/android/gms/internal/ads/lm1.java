package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class lm1<E> extends cm1<E> {
    static final lm1<Object> i = new lm1<>(new Object[0], 0, null, 0, 0);
    private final transient Object[] d;
    private final transient Object[] e;
    private final transient int f;
    private final transient int g;
    private final transient int h;

    lm1(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.d = objArr;
        this.e = objArr2;
        this.f = i3;
        this.g = i2;
        this.h = i4;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int a(Object[] objArr, int i2) {
        System.arraycopy(this.d, 0, objArr, i2, this.h);
        return i2 + this.h;
    }

    @Override // com.google.android.gms.internal.ads.tl1
    /* renamed from: a */
    public final qm1<E> iterator() {
        return (qm1) g().iterator();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final Object[] b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.e;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = ql1.a(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i2 = a2 & this.f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int d() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int e() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.cm1
    public final int hashCode() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.cm1
    public final boolean k() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.cm1
    public final ul1<E> l() {
        return ul1.b(this.d, this.h);
    }

    public final int size() {
        return this.h;
    }
}
