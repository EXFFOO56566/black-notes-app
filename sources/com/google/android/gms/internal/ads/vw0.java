package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class vw0 implements r42<tw0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5174a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5175b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<fk0> f5176c;

    public vw0(e52<Context> e52, e52<Executor> e522, e52<fk0> e523) {
        this.f5174a = e52;
        this.f5175b = e522;
        this.f5176c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new tw0(this.f5174a.get(), this.f5175b.get(), this.f5176c.get());
    }
}
