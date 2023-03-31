package com.google.android.gms.internal.ads;

public final class xx implements r42<io> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f5508a;

    public xx(e52<String> e52) {
        this.f5508a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        io ioVar = new io(this.f5508a.get());
        y42.a(ioVar, "Cannot return null from a non-@Nullable @Provides method");
        return ioVar;
    }
}
