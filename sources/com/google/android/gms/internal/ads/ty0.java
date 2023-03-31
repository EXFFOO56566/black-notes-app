package com.google.android.gms.internal.ads;

public final class ty0 implements r42<ry0> {

    /* renamed from: a  reason: collision with root package name */
    private final ry0 f4879a;

    private ty0(ry0 ry0) {
        this.f4879a = ry0;
    }

    public static ty0 a(ry0 ry0) {
        return new ty0(ry0);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        ry0 ry0 = this.f4879a;
        if (ry0 != null) {
            y42.a(ry0, "Cannot return null from a non-@Nullable @Provides method");
            return ry0;
        }
        throw null;
    }
}
