package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ux implements r42<tm> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5017a;

    public ux(e52<Context> e52) {
        this.f5017a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        tm tmVar = new tm(this.f5017a.get());
        y42.a(tmVar, "Cannot return null from a non-@Nullable @Provides method");
        return tmVar;
    }
}
