package com.google.android.gms.internal.ads;

import android.content.Context;

public final class f61 implements r42<d61> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<cj> f2539a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f2540b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f2541c;

    private f61(e52<cj> e52, e52<ko1> e522, e52<Context> e523) {
        this.f2539a = e52;
        this.f2540b = e522;
        this.f2541c = e523;
    }

    public static f61 a(e52<cj> e52, e52<ko1> e522, e52<Context> e523) {
        return new f61(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new d61(this.f2539a.get(), this.f2540b.get(), this.f2541c.get());
    }
}
