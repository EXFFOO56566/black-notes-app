package com.google.android.gms.internal.ads;

public final class a10 implements r42<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f1673a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<p00> f1674b;

    public a10(r00 r00, e52<p00> e52) {
        this.f1673a = r00;
        this.f1674b = e52;
    }

    public static n00 a(r00 r00, Object obj) {
        p00 p00 = (p00) obj;
        y42.a(p00, "Cannot return null from a non-@Nullable @Provides method");
        return p00;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f1673a, this.f1674b.get());
    }
}
