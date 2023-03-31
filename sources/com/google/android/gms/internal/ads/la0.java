package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;

public final class la0 implements r42<lw0> {

    /* renamed from: a  reason: collision with root package name */
    private final k90 f3514a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<d> f3515b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<nw0> f3516c;

    private la0(k90 k90, e52<d> e52, e52<nw0> e522) {
        this.f3514a = k90;
        this.f3515b = e52;
        this.f3516c = e522;
    }

    public static la0 a(k90 k90, e52<d> e52, e52<nw0> e522) {
        return new la0(k90, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        lw0 a2 = this.f3514a.a(this.f3515b.get(), this.f3516c.get());
        y42.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
