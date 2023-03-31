package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class wy implements r42<ty> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5330a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<vd1> f5331b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<id1> f5332c;
    private final e52<ci1> d;
    private final e52<View> e;
    private final e52<eq1> f;

    private wy(e52<Context> e52, e52<vd1> e522, e52<id1> e523, e52<ci1> e524, e52<View> e525, e52<eq1> e526) {
        this.f5330a = e52;
        this.f5331b = e522;
        this.f5332c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    public static wy a(e52<Context> e52, e52<vd1> e522, e52<id1> e523, e52<ci1> e524, e52<View> e525, e52<eq1> e526) {
        return new wy(e52, e522, e523, e524, e525, e526);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ty(this.f5330a.get(), this.f5331b.get(), this.f5332c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
