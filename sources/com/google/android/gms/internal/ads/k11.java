package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class k11 implements ln1<zf, l11> {

    /* renamed from: a  reason: collision with root package name */
    private Executor f3306a;

    /* renamed from: b  reason: collision with root package name */
    private sq0 f3307b;

    public k11(Executor executor, sq0 sq0) {
        this.f3306a = executor;
        this.f3307b = sq0;
    }

    /* Return type fixed from 'com.google.android.gms.internal.ads.lo1' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.ln1
    public final /* synthetic */ lo1<l11> a(zf zfVar) {
        zf zfVar2 = zfVar;
        return yn1.a(this.f3307b.a(zfVar2), new j11(zfVar2), this.f3306a);
    }
}
