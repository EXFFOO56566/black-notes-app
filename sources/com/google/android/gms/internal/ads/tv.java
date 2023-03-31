package com.google.android.gms.internal.ads;

public final class tv implements r42<jy> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<kv> f4861a;

    public tv(nv nvVar, e52<kv> e52) {
        this.f4861a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        kv kvVar = this.f4861a.get();
        y42.a(kvVar, "Cannot return null from a non-@Nullable @Provides method");
        return kvVar;
    }
}
