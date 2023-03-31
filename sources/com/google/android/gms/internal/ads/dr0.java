package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public final class dr0 {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f2301a;

    /* renamed from: b  reason: collision with root package name */
    private final tq0 f2302b;

    /* renamed from: c  reason: collision with root package name */
    private final l42<mr0> f2303c;

    public dr0(ko1 ko1, tq0 tq0, l42<mr0> l42) {
        this.f2301a = ko1;
        this.f2302b = tq0;
        this.f2303c = l42;
    }

    private final <RetT> lo1<RetT> a(zf zfVar, kr0<InputStream> kr0, kr0<InputStream> kr02, ln1<InputStream, RetT> ln1) {
        String str = zfVar.e;
        q.c();
        return (tn1) yn1.a(tn1.b(gl.e(str) ? yn1.a((Throwable) new ar0(0)) : yn1.a(kr0.a(zfVar), ExecutionException.class, cr0.f2157a, this.f2301a)).a(ln1, this.f2301a), ar0.class, new fr0(this, kr02, zfVar, ln1), this.f2301a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(kr0 kr0, zf zfVar, ln1 ln1, ar0 ar0) {
        return yn1.a(kr0.a(zfVar), ln1, this.f2301a);
    }

    public final lo1<zf> a(zf zfVar) {
        er0 er0 = new er0(zfVar);
        tq0 tq0 = this.f2302b;
        tq0.getClass();
        return a(zfVar, hr0.a(tq0), new gr0(this), er0);
    }

    public final lo1<Void> b(zf zfVar) {
        if (q52.b(zfVar.l)) {
            return yn1.a((Throwable) new nr0("Pool key missing from removeUrl call.", 1));
        }
        return a(zfVar, new ir0(this), new lr0(this), jr0.f3269a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 c(zf zfVar) {
        return this.f2303c.get().A(zfVar.l);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 d(zf zfVar) {
        return this.f2302b.a(zfVar.l);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 e(zf zfVar) {
        return this.f2303c.get().b(zfVar, Binder.getCallingUid());
    }
}
