package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

public final class c91 implements r42<a91> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<je> f2084a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ScheduledExecutorService> f2085b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f2086c;

    public c91(e52<je> e52, e52<ScheduledExecutorService> e522, e52<Context> e523) {
        this.f2084a = e52;
        this.f2085b = e522;
        this.f2086c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new a91(this.f2084a.get(), this.f2085b.get(), this.f2086c.get());
    }
}
