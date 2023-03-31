package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.c;

public final class j40 implements r42<c> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3172a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<vi> f3173b;

    private j40(g40 g40, e52<Context> e52, e52<vi> e522) {
        this.f3172a = e52;
        this.f3173b = e522;
    }

    public static j40 a(g40 g40, e52<Context> e52, e52<vi> e522) {
        return new j40(g40, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        c cVar = new c(this.f3172a.get(), this.f3173b.get(), null);
        y42.a(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
