package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class e80 extends j90<i80> {

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f2382c;
    private final d d;
    @GuardedBy("this")
    private long e = -1;
    @GuardedBy("this")
    private long f = -1;
    @GuardedBy("this")
    private boolean g = false;
    @GuardedBy("this")
    private ScheduledFuture<?> h;

    public e80(ScheduledExecutorService scheduledExecutorService, d dVar) {
        super(Collections.emptySet());
        this.f2382c = scheduledExecutorService;
        this.d = dVar;
    }

    /* access modifiers changed from: private */
    public final void S() {
        a(d80.f2224a);
    }

    private final synchronized void a(long j) {
        if (this.h != null && !this.h.isDone()) {
            this.h.cancel(true);
        }
        this.e = this.d.b() + j;
        this.h = this.f2382c.schedule(new f80(this), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void R() {
        this.g = false;
        a(0);
    }

    public final synchronized void c(int i) {
        if (i > 0) {
            long millis = TimeUnit.SECONDS.toMillis((long) i);
            if (this.g) {
                if (this.f <= 0 || millis >= this.f) {
                    millis = this.f;
                }
                this.f = millis;
                return;
            }
            if (this.d.b() > this.e || this.e - this.d.b() > millis) {
                a(millis);
            }
        }
    }

    public final synchronized void onPause() {
        if (!this.g) {
            if (this.h == null || this.h.isCancelled()) {
                this.f = -1;
            } else {
                this.h.cancel(true);
                this.f = this.e - this.d.b();
            }
            this.g = true;
        }
    }

    public final synchronized void onResume() {
        if (this.g) {
            if (this.f > 0 && this.h.isCancelled()) {
                a(this.f);
            }
            this.g = false;
        }
    }
}
