package com.google.android.gms.internal.ads;

import android.content.Context;

public final class w51 implements r42<u51> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5213a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<String> f5214b;

    private w51(e52<Context> e52, e52<String> e522) {
        this.f5213a = e52;
        this.f5214b = e522;
    }

    public static u51 a(Context context, String str) {
        return new u51(context, str);
    }

    public static w51 a(e52<Context> e52, e52<String> e522) {
        return new w51(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5213a.get(), this.f5214b.get());
    }
}
