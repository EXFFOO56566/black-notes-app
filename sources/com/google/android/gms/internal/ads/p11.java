package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

public final class p11 implements r42<n11> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f4087a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f4088b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<zd1> f4089c;
    private final e52<ViewGroup> d;

    public p11(e52<ko1> e52, e52<Context> e522, e52<zd1> e523, e52<ViewGroup> e524) {
        this.f4087a = e52;
        this.f4088b = e522;
        this.f4089c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new n11(this.f4087a.get(), this.f4088b.get(), this.f4089c.get(), this.d.get());
    }
}
