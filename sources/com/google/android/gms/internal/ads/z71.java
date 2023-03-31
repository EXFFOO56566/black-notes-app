package com.google.android.gms.internal.ads;

import android.content.Context;

public final class z71 implements r42<x71> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<gg> f5707a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f5708b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<String> f5709c;
    private final e52<ko1> d;

    public z71(e52<gg> e52, e52<Context> e522, e52<String> e523, e52<ko1> e524) {
        this.f5707a = e52;
        this.f5708b = e522;
        this.f5709c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new x71(this.f5707a.get(), this.f5708b.get(), this.f5709c.get(), this.d.get());
    }
}
