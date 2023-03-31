package com.google.android.gms.internal.ads;

public final class e10 implements r42<ab0<l70>> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f2353a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<d20> f2354b;

    public e10(r00 r00, e52<d20> e52) {
        this.f2353a = r00;
        this.f2354b = e52;
    }

    public static ab0<l70> a(r00 r00, d20 d20) {
        ab0<l70> ab0 = new ab0<>(d20, jo.e);
        y42.a(ab0, "Cannot return null from a non-@Nullable @Provides method");
        return ab0;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2353a, this.f2354b.get());
    }
}
