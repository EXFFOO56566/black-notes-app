package com.google.android.gms.internal.ads;

public abstract class sp1<PrimitiveT, KeyT> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<PrimitiveT> f4692a;

    public sp1(Class<PrimitiveT> cls) {
        this.f4692a = cls;
    }

    /* access modifiers changed from: package-private */
    public final Class<PrimitiveT> a() {
        return this.f4692a;
    }

    public abstract PrimitiveT a(KeyT keyt);
}
