package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

final /* synthetic */ class op0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final eq1 f4028a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4029b;

    op0(eq1 eq1, Context context) {
        this.f4028a = eq1;
        this.f4029b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        eq1 eq1 = this.f4028a;
        return eq1.a().a(this.f4029b);
    }
}
