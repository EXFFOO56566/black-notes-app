package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.k20;
import java.util.LinkedList;
import javax.annotation.concurrent.GuardedBy;

public final class ag1<AdT extends k20> {

    /* renamed from: a  reason: collision with root package name */
    private final df1 f1748a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private gg1 f1749b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private so1<rf1<AdT>> f1750c;
    @GuardedBy("this")
    private lo1<rf1<AdT>> d;
    @GuardedBy("this")
    private int e = pf1.g;
    private final kf1 f;
    private final hg1<AdT> g;
    private final LinkedList<gg1> h;
    private final zn1<rf1<AdT>> i = new fg1(this);

    public ag1(kf1 kf1, df1 df1, hg1<AdT> hg1) {
        this.f = kf1;
        this.f1748a = df1;
        this.g = hg1;
        this.h = new LinkedList<>();
        this.f1748a.a(new cg1(this));
    }

    private final boolean b() {
        lo1<rf1<AdT>> lo1 = this.d;
        return lo1 == null || lo1.isDone();
    }

    /* access modifiers changed from: private */
    public final void c(gg1 gg1) {
        while (b()) {
            if (gg1 != null || !this.h.isEmpty()) {
                if (gg1 == null) {
                    gg1 = this.h.remove();
                }
                if (gg1.a() == null || !this.f.a(gg1.a())) {
                    gg1 = null;
                } else {
                    this.f1749b = gg1.c();
                    this.f1750c = so1.h();
                    lo1<rf1<AdT>> a2 = this.g.a(this.f1749b);
                    this.d = a2;
                    yn1.a(a2, this.i, gg1.b());
                    return;
                }
            } else {
                return;
            }
        }
        if (gg1 != null) {
            this.h.add(gg1);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(rf1 rf1) {
        lo1 a2;
        synchronized (this) {
            a2 = yn1.a(new eg1(rf1, this.f1749b));
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        synchronized (this) {
            c(this.f1749b);
        }
    }

    public final void a(gg1 gg1) {
        this.h.add(gg1);
    }

    public final synchronized lo1<eg1<AdT>> b(gg1 gg1) {
        if (b()) {
            return null;
        }
        this.e = pf1.i;
        if (this.f1749b.a() == null || gg1.a() == null || !this.f1749b.a().equals(gg1.a())) {
            return null;
        }
        this.e = pf1.h;
        return yn1.a(this.f1750c, new dg1(this), gg1.b());
    }
}
