package com.google.android.gms.internal.ads;

import android.content.Context;

public final class j50 implements r42<Context> {

    /* renamed from: a  reason: collision with root package name */
    private final g50 f3177a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f3178b;

    private j50(g50 g50, e52<Context> e52) {
        this.f3177a = g50;
        this.f3178b = e52;
    }

    public static j50 a(g50 g50, e52<Context> e52) {
        return new j50(g50, e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Context a2 = this.f3177a.a(this.f3178b.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
