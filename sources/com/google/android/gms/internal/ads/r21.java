package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

public final class r21 implements y61<v61<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4432a;

    /* renamed from: b  reason: collision with root package name */
    private final ik f4433b;

    r21(Executor executor, ik ikVar) {
        this.f4432a = executor;
        this.f4433b = ikVar;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<Bundle>> a() {
        return ((Boolean) on2.e().a(zr2.b1)).booleanValue() ? yn1.a((Object) null) : yn1.a(this.f4433b.j(), q21.f4263a, this.f4432a);
    }
}
