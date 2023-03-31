package com.google.android.gms.internal.ads;

public final class sv implements r42<eq1> {

    /* renamed from: a  reason: collision with root package name */
    private final nv f4708a;

    public sv(nv nvVar) {
        this.f4708a = nvVar;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        eq1 e = this.f4708a.e();
        y42.a(e, "Cannot return null from a non-@Nullable @Provides method");
        return e;
    }
}
