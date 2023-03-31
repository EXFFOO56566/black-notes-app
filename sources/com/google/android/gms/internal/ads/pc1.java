package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.x.a;
import com.google.android.gms.internal.ads.g50;
import com.google.android.gms.internal.ads.k90;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class pc1 implements d01<ck0> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4144a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f4145b;

    /* renamed from: c  reason: collision with root package name */
    private final kv f4146c;
    private final rb1 d;
    private final mb1<fk0, ck0> e;
    private final td1 f;
    @GuardedBy("this")
    private final be1 g;
    @GuardedBy("this")
    private lo1<ck0> h;

    public pc1(Context context, Executor executor, kv kvVar, mb1<fk0, ck0> mb1, rb1 rb1, be1 be1, td1 td1) {
        this.f4144a = context;
        this.f4145b = executor;
        this.f4146c = kvVar;
        this.e = mb1;
        this.d = rb1;
        this.g = be1;
        this.f = td1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ik0 a(lb1 lb1) {
        uc1 uc1 = (uc1) lb1;
        rb1 a2 = rb1.a(this.d);
        ik0 m = this.f4146c.m();
        g50.a aVar = new g50.a();
        aVar.a(this.f4144a);
        aVar.a(uc1.f4928a);
        aVar.a(uc1.f4929b);
        aVar.a(this.f);
        m.b(aVar.a());
        k90.a aVar2 = new k90.a();
        aVar2.a((u50) a2, this.f4145b);
        aVar2.a((l70) a2, this.f4145b);
        aVar2.a((a60) a2, this.f4145b);
        aVar2.a((a) a2, this.f4145b);
        aVar2.a((j60) a2, this.f4145b);
        aVar2.a((b80) a2, this.f4145b);
        aVar2.a(a2);
        m.a(aVar2.a());
        return m;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a() {
        this.d.a(1);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        this.g.c().a(i);
    }

    @Override // com.google.android.gms.internal.ads.d01
    public final boolean a(rm2 rm2, String str, c01 c01, f01<? super ck0> f01) {
        kh khVar = new kh(rm2, str);
        String str2 = c01 instanceof mc1 ? ((mc1) c01).f3688a : null;
        if (khVar.f3391c == null) {
            co.b("Ad unit ID should not be null for rewarded video ad.");
            this.f4145b.execute(new oc1(this));
            return false;
        }
        lo1<ck0> lo1 = this.h;
        if (lo1 != null && !lo1.isDone()) {
            return false;
        }
        ie1.a(this.f4144a, khVar.f3390b.g);
        be1 be1 = this.g;
        be1.a(khVar.f3391c);
        be1.a(um2.g());
        be1.a(khVar.f3390b);
        zd1 d2 = be1.d();
        uc1 uc1 = new uc1(null);
        uc1.f4928a = d2;
        uc1.f4929b = str2;
        lo1<ck0> a2 = this.e.a(new nb1(uc1), new rc1(this));
        this.h = a2;
        yn1.a(a2, new qc1(this, f01, uc1), this.f4145b);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.d01
    public final boolean u() {
        lo1<ck0> lo1 = this.h;
        return lo1 != null && !lo1.isDone();
    }
}
