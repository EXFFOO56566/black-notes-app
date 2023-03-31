package com.google.android.gms.internal.ads;

import android.content.Context;

public final class xc1 implements r42<wc1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f5407a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<pc1> f5408b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Context> f5409c;
    private final e52<rb1> d;
    private final e52<td1> e;

    public xc1(e52<String> e52, e52<pc1> e522, e52<Context> e523, e52<rb1> e524, e52<td1> e525) {
        this.f5407a = e52;
        this.f5408b = e522;
        this.f5409c = e523;
        this.d = e524;
        this.e = e525;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new wc1(this.f5407a.get(), this.f5408b.get(), this.f5409c.get(), this.d.get(), this.e.get());
    }
}
