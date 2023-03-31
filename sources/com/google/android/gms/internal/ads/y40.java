package com.google.android.gms.internal.ads;

public final class y40 implements r42<e80> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<e80> f5536a;

    private y40(e52<e80> e52) {
        this.f5536a = e52;
    }

    public static y40 a(e52<e80> e52) {
        return new y40(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        e80 e80 = this.f5536a.get();
        y42.a(e80, "Cannot return null from a non-@Nullable @Provides method");
        return e80;
    }
}
