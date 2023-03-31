package com.google.android.gms.internal.ads;

public final class mx implements r42<ea> {

    /* renamed from: a  reason: collision with root package name */
    private final ix f3763a;

    public mx(ix ixVar) {
        this.f3763a = ixVar;
    }

    public static ea a(ix ixVar) {
        ea c2 = ixVar.c();
        y42.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f3763a);
    }
}
