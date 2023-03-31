package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class a20 implements r42<v10> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<n20> f1679a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<r3> f1680b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Runnable> f1681c;
    private final e52<Executor> d;

    public a20(e52<n20> e52, e52<r3> e522, e52<Runnable> e523, e52<Executor> e524) {
        this.f1679a = e52;
        this.f1680b = e522;
        this.f1681c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new v10(this.f1679a.get(), this.f1680b.get(), this.f1681c.get(), this.d.get());
    }
}
