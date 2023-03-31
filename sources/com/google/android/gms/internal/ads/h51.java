package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

public final class h51 implements r42<f51> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<ko1> f2863a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f2864b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Set<String>> f2865c;

    private h51(e52<ko1> e52, e52<Context> e522, e52<Set<String>> e523) {
        this.f2863a = e52;
        this.f2864b = e522;
        this.f2865c = e523;
    }

    public static h51 a(e52<ko1> e52, e52<Context> e522, e52<Set<String>> e523) {
        return new h51(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new f51(this.f2863a.get(), this.f2864b.get(), this.f2865c.get());
    }
}
