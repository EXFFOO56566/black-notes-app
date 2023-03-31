package com.google.android.gms.internal.ads;

import android.content.Context;

public final class fj0 implements r42<dj0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2603a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<if0> f2604b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<gg0> f2605c;
    private final e52<xe0> d;

    private fj0(e52<Context> e52, e52<if0> e522, e52<gg0> e523, e52<xe0> e524) {
        this.f2603a = e52;
        this.f2604b = e522;
        this.f2605c = e523;
        this.d = e524;
    }

    public static fj0 a(e52<Context> e52, e52<if0> e522, e52<gg0> e523, e52<xe0> e524) {
        return new fj0(e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new dj0(this.f2603a.get(), this.f2604b.get(), this.f2605c.get(), this.d.get());
    }
}
