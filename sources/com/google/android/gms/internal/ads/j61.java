package com.google.android.gms.internal.ads;

import android.content.Context;

public final class j61 implements r42<h61> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f3181a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f3182b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<fo> f3183c;

    private j61(e52<ko1> e52, e52<Context> e522, e52<fo> e523) {
        this.f3181a = e52;
        this.f3182b = e522;
        this.f3183c = e523;
    }

    public static j61 a(e52<ko1> e52, e52<Context> e522, e52<fo> e523) {
        return new j61(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new h61(this.f3181a.get(), this.f3182b.get(), this.f3183c.get());
    }
}
