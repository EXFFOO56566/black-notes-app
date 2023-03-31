package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class xv0 implements r42<uv0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5500a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd0> f5501b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f5502c;

    public xv0(e52<Context> e52, e52<zd0> e522, e52<Executor> e523) {
        this.f5500a = e52;
        this.f5501b = e522;
        this.f5502c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new uv0(this.f5500a.get(), this.f5501b.get(), this.f5502c.get());
    }
}
