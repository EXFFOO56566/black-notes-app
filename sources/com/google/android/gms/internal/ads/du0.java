package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class du0 implements r42<bu0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2318a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f2319b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<k10> f2320c;
    private final e52<Executor> d;

    public du0(e52<Context> e52, e52<fo> e522, e52<k10> e523, e52<Executor> e524) {
        this.f2318a = e52;
        this.f2319b = e522;
        this.f2320c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new bu0(this.f2318a.get(), this.f2319b.get(), this.f2320c.get(), this.d.get());
    }
}
