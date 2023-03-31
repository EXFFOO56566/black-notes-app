package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class jm1<K> extends cm1<K> {
    private final transient yl1<K, ?> d;
    private final transient ul1<K> e;

    jm1(yl1<K, ?> yl1, ul1<K> ul1) {
        this.d = yl1;
        this.e = ul1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final int a(Object[] objArr, int i) {
        return g().a(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.tl1
    /* renamed from: a */
    public final qm1<K> iterator() {
        return (qm1) g().iterator();
    }

    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean contains(@NullableDecl Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.cm1, com.google.android.gms.internal.ads.tl1
    public final ul1<K> g() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.tl1
    public final boolean i() {
        return true;
    }

    public final int size() {
        return this.d.size();
    }
}
