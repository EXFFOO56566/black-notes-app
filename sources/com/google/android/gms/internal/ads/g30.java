package com.google.android.gms.internal.ads;

public final class g30 implements r42<id1> {

    /* renamed from: a  reason: collision with root package name */
    private final d30 f2697a;

    private g30(d30 d30) {
        this.f2697a = d30;
    }

    public static g30 a(d30 d30) {
        return new g30(d30);
    }

    public static id1 b(d30 d30) {
        id1 b2 = d30.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f2697a);
    }
}
