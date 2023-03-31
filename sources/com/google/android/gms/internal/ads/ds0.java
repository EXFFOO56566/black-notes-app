package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

public final class ds0 implements r42<mr0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2309a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Executor> f2310b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<rg> f2311c;
    private final e52<jy> d;
    private final e52<ng> e;
    private final e52<HashMap<String, cs0>> f;

    private ds0(e52<Context> e52, e52<Executor> e522, e52<rg> e523, e52<jy> e524, e52<ng> e525, e52<HashMap<String, cs0>> e526) {
        this.f2309a = e52;
        this.f2310b = e522;
        this.f2311c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
    }

    public static ds0 a(e52<Context> e52, e52<Executor> e522, e52<rg> e523, e52<jy> e524, e52<ng> e525, e52<HashMap<String, cs0>> e526) {
        return new ds0(e52, e522, e523, e524, e525, e526);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new mr0(this.f2309a.get(), this.f2310b.get(), this.f2311c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
