package com.google.android.gms.internal.ads;

public final class y00 implements r42<hd1> {

    /* renamed from: a  reason: collision with root package name */
    private final r00 f5519a;

    public y00(r00 r00) {
        this.f5519a = r00;
    }

    public static hd1 a(r00 r00) {
        hd1 d = r00.d();
        y42.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5519a);
    }
}
