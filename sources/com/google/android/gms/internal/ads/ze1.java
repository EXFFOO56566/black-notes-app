package com.google.android.gms.internal.ads;

public final class ze1 implements r42<yk> {

    /* renamed from: a  reason: collision with root package name */
    private final af1 f5740a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ye1> f5741b;

    private ze1(af1 af1, e52<ye1> e52) {
        this.f5740a = af1;
        this.f5741b = e52;
    }

    public static yk a(af1 af1, ye1 ye1) {
        yk ykVar = ye1.f5582b;
        y42.a(ykVar, "Cannot return null from a non-@Nullable @Provides method");
        return ykVar;
    }

    public static ze1 a(af1 af1, e52<ye1> e52) {
        return new ze1(af1, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5740a, this.f5741b.get());
    }
}
