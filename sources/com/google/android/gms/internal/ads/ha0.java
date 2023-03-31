package com.google.android.gms.internal.ads;

public final class ha0 implements r42<k90> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f2886a;

    private ha0(k90 k90) {
        this.f2886a = k90;
    }

    public static ha0 a(k90 k90) {
        return new ha0(k90);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        k90 k90 = this.f2886a;
        if (k90 != null) {
            y42.a(k90, "Cannot return null from a non-@Nullable @Provides method");
            return k90;
        }
        throw null;
    }
}
