package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

public final class re0 implements r42<za0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f4489a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<id1> f4490b;

    public re0(e52<Context> e52, e52<id1> e522) {
        this.f4489a = e52;
        this.f4490b = e522;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        za0 za0 = new za0(this.f4489a.get(), new HashSet(), this.f4490b.get());
        y42.a(za0, "Cannot return null from a non-@Nullable @Provides method");
        return za0;
    }
}
