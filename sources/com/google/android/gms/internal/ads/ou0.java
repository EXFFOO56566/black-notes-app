package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class ou0 implements r42<ju0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4045a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f4046b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ad0> f4047c;
    private final e52<gd1> d;

    public ou0(e52<Context> e52, e52<Executor> e522, e52<ad0> e523, e52<gd1> e524) {
        this.f4045a = e52;
        this.f4046b = e522;
        this.f4047c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ju0(this.f4045a.get(), this.f4046b.get(), this.f4047c.get(), this.d.get());
    }
}
