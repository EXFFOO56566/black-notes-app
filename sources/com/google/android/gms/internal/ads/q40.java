package com.google.android.gms.internal.ads;

import android.content.Context;

public final class q40 implements r42<r40> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4269a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f4270b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<fo> f4271c;
    private final e52<yk> d;
    private final e52<uo0> e;

    private q40(e52<Context> e52, e52<zd1> e522, e52<fo> e523, e52<yk> e524, e52<uo0> e525) {
        this.f4269a = e52;
        this.f4270b = e522;
        this.f4271c = e523;
        this.d = e524;
        this.e = e525;
    }

    public static q40 a(e52<Context> e52, e52<zd1> e522, e52<fo> e523, e52<yk> e524, e52<uo0> e525) {
        return new q40(e52, e522, e523, e524, e525);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new r40(this.f4269a.get(), this.f4270b.get(), this.f4271c.get(), this.d.get(), this.e.get());
    }
}
