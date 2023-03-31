package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

public final class jz0 implements r42<ez0> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Executor> f3297a;

    public jz0(e52<Executor> e52) {
        this.f3297a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new ez0(this.f3297a.get());
    }
}
