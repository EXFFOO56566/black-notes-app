package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class s00 implements r42<p00> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<n20> f4583a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<Context> f4584b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<hd1> f4585c;
    private final e52<View> d;
    private final e52<ws> e;
    private final e52<l20> f;
    private final e52<rf0> g;
    private final e52<eb0> h;
    private final e52<kz0> i;
    private final e52<Executor> j;

    public s00(e52<n20> e52, e52<Context> e522, e52<hd1> e523, e52<View> e524, e52<ws> e525, e52<l20> e526, e52<rf0> e527, e52<eb0> e528, e52<kz0> e529, e52<Executor> e5210) {
        this.f4583a = e52;
        this.f4584b = e522;
        this.f4585c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
        this.i = e529;
        this.j = e5210;
    }

    public static p00 a(n20 n20, Context context, hd1 hd1, View view, ws wsVar, l20 l20, rf0 rf0, eb0 eb0, l42<kz0> l42, Executor executor) {
        return new p00(n20, context, hd1, view, wsVar, l20, rf0, eb0, l42, executor);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return a(this.f4583a.get(), this.f4584b.get(), this.f4585c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), t42.b(this.i), this.j.get());
    }
}
