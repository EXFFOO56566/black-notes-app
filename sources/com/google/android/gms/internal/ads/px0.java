package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class px0 implements r42<ex0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4246a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f4247b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f4248c;
    private final e52<Executor> d;
    private final e52<fk0> e;
    private final e52<pk0> f;

    public px0(e52<Context> e52, e52<fo> e522, e52<zd1> e523, e52<Executor> e524, e52<fk0> e525, e52<pk0> e526) {
        this.f4246a = e52;
        this.f4247b = e522;
        this.f4248c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ex0(this.f4246a.get(), this.f4247b.get(), this.f4248c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
