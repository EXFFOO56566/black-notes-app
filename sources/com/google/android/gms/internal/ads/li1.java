package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class li1 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3560a;

    li1(Context context) {
        this.f3560a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return ji1.a(this.f3560a);
    }
}
