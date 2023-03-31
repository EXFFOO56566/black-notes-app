package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ik2;

public final class kd0 implements r42<ld0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f3372a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ws> f3373b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<id1> f3374c;
    private final e52<fo> d;
    private final e52<ik2.a> e;

    private kd0(e52<Context> e52, e52<ws> e522, e52<id1> e523, e52<fo> e524, e52<ik2.a> e525) {
        this.f3372a = e52;
        this.f3373b = e522;
        this.f3374c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static kd0 a(e52<Context> e52, e52<ws> e522, e52<id1> e523, e52<fo> e524, e52<ik2.a> e525) {
        return new kd0(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ld0(this.f3372a.get(), this.f3373b.get(), this.f3374c.get(), this.d.get(), this.e.get());
    }
}
