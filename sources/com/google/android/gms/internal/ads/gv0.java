package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

public final class gv0 implements r42<ev0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f2816a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f2817b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ad0> f2818c;
    private final e52<Executor> d;

    public gv0(e52<Context> e52, e52<fo> e522, e52<ad0> e523, e52<Executor> e524) {
        this.f2816a = e52;
        this.f2817b = e522;
        this.f2818c = e523;
        this.d = e524;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ev0(this.f2816a.get(), this.f2817b.get(), this.f2818c.get(), this.d.get());
    }
}
