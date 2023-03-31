package com.google.android.gms.internal.ads;

import android.content.Context;

public final class j81 implements r42<h81> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<kj2> f3191a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f3192b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f3193c;

    public j81(e52<kj2> e52, e52<ko1> e522, e52<Context> e523) {
        this.f3191a = e52;
        this.f3192b = e522;
        this.f3193c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new h81(this.f3191a.get(), this.f3192b.get(), this.f3193c.get());
    }
}
