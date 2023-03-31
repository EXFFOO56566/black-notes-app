package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

final class f22 extends l22 {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ a22 f2523c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f22(a22 a22) {
        super(a22, null);
        this.f2523c = a22;
    }

    /* synthetic */ f22(a22 a22, d22 d22) {
        this(a22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.gms.internal.ads.l22, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new c22(this.f2523c, null);
    }
}
