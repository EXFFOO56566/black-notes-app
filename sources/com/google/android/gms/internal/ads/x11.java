package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class x11 implements r42<w11> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<lo1<String>> f5348a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f5349b;

    private x11(e52<lo1<String>> e52, e52<Executor> e522) {
        this.f5348a = e52;
        this.f5349b = e522;
    }

    public static x11 a(e52<lo1<String>> e52, e52<Executor> e522) {
        return new x11(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new w11(this.f5348a.get(), this.f5349b.get());
    }
}
