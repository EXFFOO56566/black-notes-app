package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class tt0 implements r42<pt0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<b00> f4853a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f4854b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f4855c;
    private final e52<pk0> d;
    private final e52<zd1> e;

    public tt0(e52<b00> e52, e52<Context> e522, e52<Executor> e523, e52<pk0> e524, e52<zd1> e525) {
        this.f4853a = e52;
        this.f4854b = e522;
        this.f4855c = e523;
        this.d = e524;
        this.e = e525;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new pt0(this.f4853a.get(), this.f4854b.get(), this.f4855c.get(), this.d.get(), this.e.get());
    }
}
