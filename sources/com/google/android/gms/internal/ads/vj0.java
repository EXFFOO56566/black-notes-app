package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.a;
import java.util.concurrent.Executor;

public final class vj0 implements r42<uj0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5122a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5123b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<eq1> f5124c;
    private final e52<fo> d;
    private final e52<a> e;
    private final e52<et> f;

    public vj0(e52<Context> e52, e52<Executor> e522, e52<eq1> e523, e52<fo> e524, e52<a> e525, e52<et> e526) {
        this.f5122a = e52;
        this.f5123b = e522;
        this.f5124c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new uj0(this.f5122a.get(), this.f5123b.get(), this.f5124c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
