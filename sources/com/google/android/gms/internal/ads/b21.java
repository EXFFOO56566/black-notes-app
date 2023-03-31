package com.google.android.gms.internal.ads;

import android.content.Context;

public final class b21 implements r42<z11> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<q31<b71>> f1847a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f1848b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f1849c;
    private final e52<ik> d;

    private b21(e52<q31<b71>> e52, e52<zd1> e522, e52<Context> e523, e52<ik> e524) {
        this.f1847a = e52;
        this.f1848b = e522;
        this.f1849c = e523;
        this.d = e524;
    }

    public static b21 a(e52<q31<b71>> e52, e52<zd1> e522, e52<Context> e523, e52<ik> e524) {
        return new b21(e52, e522, e523, e524);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new z11(this.f1847a.get(), this.f1848b.get(), this.f1849c.get(), this.d.get());
    }
}
