package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.d;
import java.util.concurrent.Executor;

public final class ei1 implements r42<ci1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f2431a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<io> f2432b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<lw0> f2433c;
    private final e52<fo> d;
    private final e52<String> e;
    private final e52<String> f;
    private final e52<Context> g;
    private final e52<td1> h;
    private final e52<d> i;
    private final e52<eq1> j;

    private ei1(e52<Executor> e52, e52<io> e522, e52<lw0> e523, e52<fo> e524, e52<String> e525, e52<String> e526, e52<Context> e527, e52<td1> e528, e52<d> e529, e52<eq1> e5210) {
        this.f2431a = e52;
        this.f2432b = e522;
        this.f2433c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
        this.i = e529;
        this.j = e5210;
    }

    public static ei1 a(e52<Executor> e52, e52<io> e522, e52<lw0> e523, e52<fo> e524, e52<String> e525, e52<String> e526, e52<Context> e527, e52<td1> e528, e52<d> e529, e52<eq1> e5210) {
        return new ei1(e52, e522, e523, e524, e525, e526, e527, e528, e529, e5210);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ci1(this.f2431a.get(), this.f2432b.get(), this.f2433c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
