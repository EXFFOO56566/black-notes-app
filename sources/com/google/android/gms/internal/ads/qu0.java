package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final /* synthetic */ class qu0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final nu0 f4393a;

    /* renamed from: b  reason: collision with root package name */
    private final vd1 f4394b;

    /* renamed from: c  reason: collision with root package name */
    private final id1 f4395c;

    qu0(nu0 nu0, vd1 vd1, id1 id1) {
        this.f4393a = nu0;
        this.f4394b = vd1;
        this.f4395c = id1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4393a.c(this.f4394b, this.f4395c);
    }
}
