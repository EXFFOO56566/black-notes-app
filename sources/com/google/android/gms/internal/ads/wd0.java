package com.google.android.gms.internal.ads;

public final class wd0 implements r42<rf0> {

    /* renamed from: a  reason: collision with root package name */
    private final vd0 f5255a;

    private wd0(vd0 vd0) {
        this.f5255a = vd0;
    }

    public static wd0 a(vd0 vd0) {
        return new wd0(vd0);
    }

    public static rf0 b(vd0 vd0) {
        rf0 a2 = vd0.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return b(this.f5255a);
    }
}
