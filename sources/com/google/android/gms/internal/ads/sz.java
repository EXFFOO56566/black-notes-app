package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class sz implements xh2 {

    /* renamed from: a  reason: collision with root package name */
    private final ScheduledExecutorService f4727a;

    /* renamed from: b  reason: collision with root package name */
    private final d f4728b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private ScheduledFuture<?> f4729c;
    @GuardedBy("this")
    private long d = -1;
    @GuardedBy("this")
    private long e = -1;
    @GuardedBy("this")
    private Runnable f = null;
    @GuardedBy("this")
    private boolean g = false;

    public sz(ScheduledExecutorService scheduledExecutorService, d dVar) {
        this.f4727a = scheduledExecutorService;
        this.f4728b = dVar;
        q.f().a(this);
    }

    private final synchronized void a() {
        if (!this.g) {
            if (this.f4729c == null || this.f4729c.isDone()) {
                this.e = -1;
            } else {
                this.f4729c.cancel(true);
                this.e = this.d - this.f4728b.b();
            }
            this.g = true;
        }
    }

    private final synchronized void b() {
        if (this.g) {
            if (this.e > 0 && this.f4729c != null && this.f4729c.isCancelled()) {
                this.f4729c = this.f4727a.schedule(this.f, this.e, TimeUnit.MILLISECONDS);
            }
            this.g = false;
        }
    }

    public final synchronized void a(int i, Runnable runnable) {
        this.f = runnable;
        long j = (long) i;
        this.d = this.f4728b.b() + j;
        this.f4729c = this.f4727a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.xh2
    public final void a(boolean z) {
        if (z) {
            b();
        } else {
            a();
        }
    }
}
