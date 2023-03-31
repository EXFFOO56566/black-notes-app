package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class vx0 implements r42<ox0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5178a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5179b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<fk0> f5180c;

    public vx0(e52<Context> e52, e52<Executor> e522, e52<fk0> e523) {
        this.f5178a = e52;
        this.f5179b = e522;
        this.f5180c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ox0(this.f5178a.get(), this.f5179b.get(), this.f5180c.get());
    }
}
