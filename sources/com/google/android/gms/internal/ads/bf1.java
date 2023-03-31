package com.google.android.gms.internal.ads;

import android.content.Context;

public final class bf1 implements r42<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final af1 f1938a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ye1> f1939b;

    private bf1(af1 af1, e52<ye1> e52) {
        this.f1938a = af1;
        this.f1939b = e52;
    }

    public static Context a(af1 af1, ye1 ye1) {
        Context context = ye1.f5581a;
        y42.a(context, "Cannot return null from a non-@Nullable @Provides method");
        return context;
    }

    public static bf1 a(af1 af1, e52<ye1> e52) {
        return new bf1(af1, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f1938a, this.f1939b.get());
    }
}
