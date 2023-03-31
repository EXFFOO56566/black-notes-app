package com.google.android.gms.internal.ads;

import android.content.Context;

public final class a50 implements r42<x40> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f1697a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<id1> f1698b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ie> f1699c;

    private a50(e52<Context> e52, e52<id1> e522, e52<ie> e523) {
        this.f1697a = e52;
        this.f1698b = e522;
        this.f1699c = e523;
    }

    public static a50 a(e52<Context> e52, e52<id1> e522, e52<ie> e523) {
        return new a50(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new x40(this.f1697a.get(), this.f1698b.get(), this.f1699c.get());
    }
}
