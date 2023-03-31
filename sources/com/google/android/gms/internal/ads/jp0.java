package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class jp0 {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f3262a;

    /* renamed from: b  reason: collision with root package name */
    private final ko1 f3263b;

    /* renamed from: c  reason: collision with root package name */
    private final oq0 f3264c;
    private final l42<mr0> d;

    public jp0(ko1 ko1, ko1 ko12, oq0 oq0, l42<mr0> l42) {
        this.f3262a = ko1;
        this.f3263b = ko12;
        this.f3264c = oq0;
        this.d = l42;
    }

    public final lo1<InputStream> a(zf zfVar) {
        String str = zfVar.e;
        q.c();
        return yn1.a(gl.e(str) ? yn1.a((Throwable) new ar0(0)) : yn1.a(this.f3262a.a(new ip0(this, zfVar)), ExecutionException.class, lp0.f3588a, this.f3263b), ar0.class, new kp0(this, zfVar, Binder.getCallingUid()), this.f3263b);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(zf zfVar, int i, ar0 ar0) {
        return this.d.get().a(zfVar, i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream b(zf zfVar) {
        return this.f3264c.a(zfVar).get((long) ((Integer) on2.e().a(zr2.w2)).intValue(), TimeUnit.SECONDS);
    }
}
