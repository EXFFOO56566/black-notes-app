package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ip0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final jp0 f3120a;

    /* renamed from: b  reason: collision with root package name */
    private final zf f3121b;

    ip0(jp0 jp0, zf zfVar) {
        this.f3120a = jp0;
        this.f3121b = zfVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f3120a.b(this.f3121b);
    }
}
