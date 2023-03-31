package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
public final class gb1<R extends e50<? extends k20>> {

    /* renamed from: a  reason: collision with root package name */
    private final kf1 f2730a;

    /* renamed from: b  reason: collision with root package name */
    private final lb1 f2731b;

    /* renamed from: c  reason: collision with root package name */
    private final ob1<R> f2732c;
    private final Executor d;
    private kb1 e;

    public gb1(kf1 kf1, lb1 lb1, ob1<R> ob1, Executor executor) {
        this.f2730a = kf1;
        this.f2731b = lb1;
        this.f2732c = ob1;
        this.d = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final uf1 b() {
        zd1 b2 = this.f2732c.a(this.f2731b).f().b();
        return this.f2730a.a(b2.d, b2.f, b2.j);
    }

    public final lo1<kb1> a() {
        lo1 lo1;
        kb1 kb1 = this.e;
        if (kb1 != null) {
            return yn1.a(kb1);
        }
        if (!r0.f4423a.a().booleanValue()) {
            kb1 kb12 = new kb1(null, b(), null);
            this.e = kb12;
            lo1 = yn1.a(kb12);
        } else {
            lo1 = tn1.b((lo1) this.f2732c.a(this.f2731b).a(new wa1(this.f2730a.a().k)).f().a().a(this.f2730a.a())).a(new hb1(this), this.d).a(ar0.class, new ib1(this), this.d);
        }
        return yn1.a(lo1, fb1.f2565a, this.d);
    }
}
