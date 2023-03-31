package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.Set;

public final class ao0 implements r42<yn0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<rn0> f1793a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Set<xn0>> f1794b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<d> f1795c;

    private ao0(e52<rn0> e52, e52<Set<xn0>> e522, e52<d> e523) {
        this.f1793a = e52;
        this.f1794b = e522;
        this.f1795c = e523;
    }

    public static ao0 a(e52<rn0> e52, e52<Set<xn0>> e522, e52<d> e523) {
        return new ao0(e52, e522, e523);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new yn0(this.f1793a.get(), this.f1794b.get(), this.f1795c.get());
    }
}
