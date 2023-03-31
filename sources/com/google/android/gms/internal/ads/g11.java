package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

public final class g11 implements r42<lo1<l11>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f2689a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<k11> f2690b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<z40> f2691c;

    public g11(e52<sh1> e52, e52<k11> e522, e52<z40> e523) {
        this.f2689a = e52;
        this.f2690b = e522;
        this.f2691c = e523;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        bh1 a2 = this.f2689a.get().a(ph1.GENERATE_SIGNALS, this.f2691c.get().b()).a((ln1) this.f2690b.get()).a((long) ((Integer) on2.e().a(zr2.w2)).intValue(), TimeUnit.SECONDS).a();
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
