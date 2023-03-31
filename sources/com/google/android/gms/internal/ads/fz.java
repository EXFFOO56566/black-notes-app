package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

public final class fz implements r42<ez> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<v9> f2676a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<cz> f2677b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f2678c;
    private final e52<vy> d;
    private final e52<d> e;

    private fz(e52<v9> e52, e52<cz> e522, e52<Executor> e523, e52<vy> e524, e52<d> e525) {
        this.f2676a = e52;
        this.f2677b = e522;
        this.f2678c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static fz a(e52<v9> e52, e52<cz> e522, e52<Executor> e523, e52<vy> e524, e52<d> e525) {
        return new fz(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ez(this.f2676a.get(), this.f2677b.get(), this.f2678c.get(), this.d.get(), this.e.get());
    }
}
