package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class pj implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final cj f4184a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4185b;

    pj(cj cjVar, Context context) {
        this.f4184a = cjVar;
        this.f4185b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f4184a.g(this.f4185b);
    }
}
