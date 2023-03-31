package com.google.android.gms.internal.ads;

public final class i30 implements r42<vd1> {

    /* renamed from: a  reason: collision with root package name */
    private final d30 f3020a;

    private i30(d30 d30) {
        this.f3020a = d30;
    }

    public static i30 a(d30 d30) {
        return new i30(d30);
    }

    public static vd1 b(d30 d30) {
        vd1 a2 = d30.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f3020a);
    }
}
