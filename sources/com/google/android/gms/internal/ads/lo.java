package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Executor;

final class lo implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3586b = new zk(Looper.getMainLooper());

    lo() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                q.c();
                gl.a(q.g().a(), th);
                throw th;
            }
        } else {
            this.f3586b.post(runnable);
        }
    }
}
