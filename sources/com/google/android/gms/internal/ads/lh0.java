package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

public final class lh0 implements r42<jh0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<tm> f3550a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<d> f3551b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f3552c;

    public lh0(e52<tm> e52, e52<d> e522, e52<Executor> e523) {
        this.f3550a = e52;
        this.f3551b = e522;
        this.f3552c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new jh0(this.f3550a.get(), this.f3551b.get(), this.f3552c.get());
    }
}
