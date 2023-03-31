package com.google.android.gms.internal.ads;

public final class se0 implements r42<jj0> {

    /* renamed from: a  reason: collision with root package name */
    private final le0 f4647a;

    public se0(le0 le0) {
        this.f4647a = le0;
    }

    public static jj0 a(le0 le0) {
        jj0 b2 = le0.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f4647a);
    }
}
