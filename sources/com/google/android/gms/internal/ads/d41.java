package com.google.android.gms.internal.ads;

import android.content.Context;

public final class d41 implements r42<z31> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2208a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<ko1> f2209b;

    private d41(e52<Context> e52, e52<ko1> e522) {
        this.f2208a = e52;
        this.f2209b = e522;
    }

    public static d41 a(e52<Context> e52, e52<ko1> e522) {
        return new d41(e52, e522);
    }

    public static z31 a(Context context, ko1 ko1) {
        return new z31(context, ko1);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f2208a.get(), this.f2209b.get());
    }
}
