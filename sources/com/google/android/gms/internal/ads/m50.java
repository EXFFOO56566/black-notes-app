package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g50;

public final class m50 implements r42<g50.a> {

    /* renamed from: a  reason: collision with root package name */
    private final g50 f3663a;

    private m50(g50 g50) {
        this.f3663a = g50;
    }

    public static m50 a(g50 g50) {
        return new m50(g50);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        g50.a a2 = this.f3663a.a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
