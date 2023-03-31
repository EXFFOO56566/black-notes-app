package com.google.android.gms.internal.ads;

public final class vv implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final nv f5167a;

    public vv(nv nvVar) {
        this.f5167a = nvVar;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        String d = this.f5167a.d();
        y42.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
