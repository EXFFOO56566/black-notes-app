package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class c11 implements r42<o01> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<kv> f2042a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2043b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<eq1> f2044c;
    private final e52<fo> d;
    private final e52<ke1<jj0>> e;
    private final e52<ko1> f;
    private final e52<ScheduledExecutorService> g;

    public c11(e52<kv> e52, e52<Context> e522, e52<eq1> e523, e52<fo> e524, e52<ke1<jj0>> e525, e52<ko1> e526, e52<ScheduledExecutorService> e527) {
        this.f2042a = e52;
        this.f2043b = e522;
        this.f2044c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new o01(this.f2042a.get(), this.f2043b.get(), this.f2044c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
