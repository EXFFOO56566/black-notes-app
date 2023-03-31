package com.google.android.gms.internal.ads;

import android.content.Context;

public final class w61 implements r42<p61> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f5216a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f5217b;

    private w61(e52<ko1> e52, e52<Context> e522) {
        this.f5216a = e52;
        this.f5217b = e522;
    }

    public static p61 a(ko1 ko1, Context context) {
        return new p61(ko1, context);
    }

    public static w61 a(e52<ko1> e52, e52<Context> e522) {
        return new w61(e52, e522);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f5216a.get(), this.f5217b.get());
    }
}
