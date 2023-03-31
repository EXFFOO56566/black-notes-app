package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class bo0 implements r42<zn0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f1981a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<io> f1982b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f1983c;
    private final e52<fo> d;

    public bo0(e52<Executor> e52, e52<io> e522, e52<Context> e523, e52<fo> e524) {
        this.f1981a = e52;
        this.f1982b = e522;
        this.f1983c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new zn0(this.f1981a.get(), this.f1982b.get(), this.f1983c.get(), this.d.get());
    }
}
