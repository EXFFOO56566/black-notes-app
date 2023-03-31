package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class cv0 implements r42<wu0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2173a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f2174b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f2175c;
    private final e52<Executor> d;
    private final e52<ad0> e;
    private final e52<pk0> f;

    public cv0(e52<Context> e52, e52<fo> e522, e52<zd1> e523, e52<Executor> e524, e52<ad0> e525, e52<pk0> e526) {
        this.f2173a = e52;
        this.f2174b = e522;
        this.f2175c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new wu0(this.f2173a.get(), this.f2174b.get(), this.f2175c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
