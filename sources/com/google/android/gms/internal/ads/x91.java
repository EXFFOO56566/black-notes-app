package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class x91 implements r42<p91> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5389a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5390b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<kv> f5391c;
    private final e52<mb1<b00, h00>> d;
    private final e52<ea1> e;
    private final e52<be1> f;

    public x91(e52<Context> e52, e52<Executor> e522, e52<kv> e523, e52<mb1<b00, h00>> e524, e52<ea1> e525, e52<be1> e526) {
        this.f5389a = e52;
        this.f5390b = e522;
        this.f5391c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new p91(this.f5389a.get(), this.f5390b.get(), this.f5391c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
