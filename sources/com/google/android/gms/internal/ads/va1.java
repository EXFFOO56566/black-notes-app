package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e50;
import com.google.android.gms.internal.ads.k20;
import java.util.concurrent.Executor;

public final class va1<R extends e50<AdT>, AdT extends k20> implements mb1<R, za1<AdT>> {

    /* renamed from: a  reason: collision with root package name */
    private final kf1 f5076a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5077b;

    /* renamed from: c  reason: collision with root package name */
    private zn1<Void> f5078c = new ab1(this);

    public va1(kf1 kf1, Executor executor) {
        this.f5076a = kf1;
        this.f5077b = executor;
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final lo1<za1<AdT>> a(nb1 nb1, ob1<R> ob1) {
        return tn1.b((lo1) new gb1(this.f5076a, nb1.f3824b, ob1, this.f5077b).a()).a(new ya1(this, nb1, ob1), this.f5077b).a(Exception.class, new xa1(this), this.f5077b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(nb1 nb1, ob1 ob1, kb1 kb1) {
        uf1 uf1 = kb1.f3363b;
        zf zfVar = kb1.f3362a;
        rf1<?> b2 = uf1 != null ? this.f5076a.b(uf1) : null;
        if (uf1 == null) {
            return yn1.a((Object) null);
        }
        if (!(b2 == null || zfVar == null)) {
            yn1.a(((e50) ob1.a(nb1.f3824b).f()).a().c(zfVar), this.f5078c, this.f5077b);
        }
        return yn1.a(new za1(uf1, zfVar, b2));
    }

    @Override // com.google.android.gms.internal.ads.mb1
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }
}
