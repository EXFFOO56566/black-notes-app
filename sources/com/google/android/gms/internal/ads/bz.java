package com.google.android.gms.internal.ads;

import android.content.Context;

public final class bz implements r42<cz> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2033a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ah2> f2034b;

    private bz(e52<Context> e52, e52<ah2> e522) {
        this.f2033a = e52;
        this.f2034b = e522;
    }

    public static bz a(e52<Context> e52, e52<ah2> e522) {
        return new bz(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new cz(this.f2033a.get(), this.f2034b.get());
    }
}
