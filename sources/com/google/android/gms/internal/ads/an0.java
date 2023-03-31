package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class an0 implements r42<Set<ab0<zh1>>> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<String> f1789a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f1790b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<Executor> f1791c;
    private final e52<Map<ph1, fn0>> d;

    public an0(e52<String> e52, e52<Context> e522, e52<Executor> e523, e52<Map<ph1, fn0>> e524) {
        this.f1789a = e52;
        this.f1790b = e522;
        this.f1791c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        Set set;
        String str = this.f1789a.get();
        Context context = this.f1790b.get();
        Executor executor = this.f1791c.get();
        Map<ph1, fn0> map = this.d.get();
        if (((Boolean) on2.e().a(zr2.g2)).booleanValue()) {
            wj2 wj2 = new wj2(new ak2(context));
            wj2.a(new cn0(str));
            set = Collections.singleton(new ab0(new dn0(wj2, map), executor));
        } else {
            set = Collections.emptySet();
        }
        y42.a(set, "Cannot return null from a non-@Nullable @Provides method");
        return set;
    }
}
