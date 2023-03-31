package com.google.android.gms.internal.ads;

public final class e11 implements r42<String> {

    /* renamed from: a  reason: collision with root package name */
    private final b11 f2355a;

    public e11(b11 b11) {
        this.f2355a = b11;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        String b2 = this.f2355a.b();
        y42.a(b2, "Cannot return null from a non-@Nullable @Provides method");
        return b2;
    }
}
