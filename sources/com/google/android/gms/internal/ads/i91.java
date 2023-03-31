package com.google.android.gms.internal.ads;

public final class i91 implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final b91 f3048a;

    public i91(b91 b91) {
        this.f3048a = b91;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        String g = this.f3048a.g();
        y42.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }
}
