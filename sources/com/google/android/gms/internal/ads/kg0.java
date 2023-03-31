package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class kg0 implements r42<gg0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<yk> f3385a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f3386b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<of0> f3387c;
    private final e52<if0> d;
    private final e52<pg0> e;
    private final e52<Executor> f;
    private final e52<Executor> g;
    private final e52<df0> h;

    private kg0(e52<yk> e52, e52<zd1> e522, e52<of0> e523, e52<if0> e524, e52<pg0> e525, e52<Executor> e526, e52<Executor> e527, e52<df0> e528) {
        this.f3385a = e52;
        this.f3386b = e522;
        this.f3387c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
    }

    public static kg0 a(e52<yk> e52, e52<zd1> e522, e52<of0> e523, e52<if0> e524, e52<pg0> e525, e52<Executor> e526, e52<Executor> e527, e52<df0> e528) {
        return new kg0(e52, e522, e523, e524, e525, e526, e527, e528);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new gg0(this.f3385a.get(), this.f3386b.get(), this.f3387c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get());
    }
}
