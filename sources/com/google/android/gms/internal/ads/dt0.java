package com.google.android.gms.internal.ads;

import android.content.Context;

public final class dt0 implements r42<xs0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2315a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<z40> f2316b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<us0> f2317c;
    private final e52<os0> d;

    private dt0(e52<Context> e52, e52<z40> e522, e52<us0> e523, e52<os0> e524) {
        this.f2315a = e52;
        this.f2316b = e522;
        this.f2317c = e523;
        this.d = e524;
    }

    public static dt0 a(e52<Context> e52, e52<z40> e522, e52<us0> e523, e52<os0> e524) {
        return new dt0(e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new xs0(this.f2315a.get(), this.f2316b.get(), this.f2317c.get(), this.d.get());
    }
}
