package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ag0 implements r42<zi> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f1746a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<zd1> f1747b;

    private ag0(wf0 wf0, e52<Context> e52, e52<zd1> e522) {
        this.f1746a = e52;
        this.f1747b = e522;
    }

    public static ag0 a(wf0 wf0, e52<Context> e52, e52<zd1> e522) {
        return new ag0(wf0, e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        zi ziVar = new zi(this.f1746a.get(), this.f1747b.get().f);
        y42.a(ziVar, "Cannot return null from a non-@Nullable @Provides method");
        return ziVar;
    }
}
