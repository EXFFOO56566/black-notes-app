package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

final class z82 implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Handler f5716b;

    z82(aa2 aa2, Handler handler) {
        this.f5716b = handler;
    }

    public final void execute(Runnable runnable) {
        this.f5716b.post(runnable);
    }
}
