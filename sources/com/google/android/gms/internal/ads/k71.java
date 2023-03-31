package com.google.android.gms.internal.ads;

import android.content.Context;

public final class k71 implements r42<i71> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f3335a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f3336b;

    private k71(e52<ko1> e52, e52<Context> e522) {
        this.f3335a = e52;
        this.f3336b = e522;
    }

    public static k71 a(e52<ko1> e52, e52<Context> e522) {
        return new k71(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new i71(this.f3335a.get(), this.f3336b.get());
    }
}
