package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class i50 implements r42<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final g50 f3028a;

    private i50(g50 g50) {
        this.f3028a = g50;
    }

    public static i50 a(g50 g50) {
        return new i50(g50);
    }

    public static Bundle b(g50 g50) {
        return g50.d();
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return this.f3028a.d();
    }
}
