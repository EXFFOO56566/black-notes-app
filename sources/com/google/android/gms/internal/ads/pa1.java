package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.k20;
import com.google.android.gms.internal.ads.ok2;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public final class pa1<R extends e50<AdT>, AdT extends k20> implements mb1<R, AdT> {

    /* renamed from: a  reason: collision with root package name */
    private final mb1<R, AdT> f4131a;

    /* renamed from: b  reason: collision with root package name */
    private final mb1<R, za1<AdT>> f4132b;

    /* renamed from: c  reason: collision with root package name */
    private final ag1<AdT> f4133c;
    @GuardedBy("this")
    private R d;
    private final Executor e;

    public pa1(mb1<R, AdT> mb1, mb1<R, za1<AdT>> mb12, ag1<AdT> ag1, Executor executor) {
        this.f4131a = mb1;
        this.f4132b = mb12;
        this.f4133c = ag1;
        this.e = executor;
    }

    private final lo1<AdT> a(rf1<AdT> rf1, nb1 nb1, ob1<R> ob1) {
        d50<R> a2 = ob1.a(nb1.f3824b);
        if (rf1.f4496c != null) {
            rf1.f4496c.e().a(a2.f().c());
            return yn1.a(rf1.f4496c);
        }
        a2.a(rf1.f4495b);
        lo1<AdT> a3 = this.f4131a.a(nb1, new sa1(a2));
        this.d = this.f4131a.a();
        return a3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized R a() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final synchronized lo1<AdT> a(nb1 nb1, ob1<R> ob1) {
        zd1 b2;
        b2 = ob1.a(nb1.f3824b).f().b();
        return tn1.b((lo1) this.f4132b.a(nb1, ob1)).a(new oa1(this, nb1, new ta1(ob1, nb1, b2.d, b2.f, this.e, b2.j, null), ob1), this.e);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(nb1 nb1, ta1 ta1, ob1 ob1, za1 za1) {
        if (za1 != null) {
            ta1 ta12 = new ta1(ta1.f4773a, ta1.f4774b, ta1.f4775c, ta1.d, ta1.e, ta1.f, za1.f5724a);
            if (za1.f5726c != null) {
                this.d = null;
                this.f4133c.a(ta12);
                return a(za1.f5726c, nb1, ob1);
            }
            lo1<eg1<AdT>> b2 = this.f4133c.b(ta12);
            if (b2 != null) {
                this.d = (R) ((e50) ob1.a(nb1.f3824b).f());
                return yn1.a(b2, new qa1(this, ob1), this.e);
            }
            this.f4133c.a(ta12);
            nb1 = new nb1(nb1.f3824b, za1.f5725b);
        }
        lo1<AdT> a2 = this.f4131a.a(nb1, ob1);
        this.d = this.f4131a.a();
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(ob1 ob1, eg1 eg1) {
        gg1 gg1;
        if (eg1 == null || eg1.f2422a == null || (gg1 = eg1.f2423b) == null) {
            throw new nr0("Empty prefetch");
        }
        ok2.c p = ok2.p();
        ok2.a.C0077a p2 = ok2.a.p();
        p2.a(ok2.b.IN_MEMORY);
        p2.a(ok2.d.p());
        p.a(p2);
        eg1.f2422a.f4494a.c().b((ok2) ((rz1) p.e()));
        return a(eg1.f2422a, ((ta1) gg1).f4774b, ob1);
    }
}
