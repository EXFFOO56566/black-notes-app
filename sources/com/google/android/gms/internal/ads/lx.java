package com.google.android.gms.internal.ads;

public final class lx implements r42<ie> {

    /* renamed from: a  reason: collision with root package name */
    private final ix f3617a;

    public lx(ix ixVar) {
        this.f3617a = ixVar;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ie b2 = this.f3617a.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
