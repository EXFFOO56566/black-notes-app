package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.k20;
import java.util.concurrent.Executor;

public final class ka1<R extends e50<AdT>, AdT extends k20> implements mb1<R, rf1<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private R f3356a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3357b = no1.a();

    @Override // com.google.android.gms.internal.ads.mb1
    public final lo1<rf1<AdT>> a(nb1 nb1, ob1<R> ob1) {
        d50<R> a2 = ob1.a(nb1.f3824b);
        a2.a(new tb1(true));
        R f = a2.f();
        this.f3356a = f;
        l30 a3 = f.a();
        rf1 rf1 = new rf1();
        zf zfVar = nb1.f3823a;
        return tn1.b((lo1) (zfVar != null ? a3.a(zfVar) : a3.a())).a(new na1(this, rf1, a3), this.f3357b).a(new ma1(rf1), this.f3357b);
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final /* synthetic */ Object a() {
        return this.f3356a;
    }
}
