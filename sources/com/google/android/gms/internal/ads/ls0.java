package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ls0 implements r42<ms0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3595a;

    private ls0(e52<Context> e52) {
        this.f3595a = e52;
    }

    public static ls0 a(e52<Context> e52) {
        return new ls0(e52);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ms0(this.f3595a.get());
    }
}
