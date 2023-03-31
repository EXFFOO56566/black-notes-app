package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class lf0 extends Thread {
    private static final boolean h = c5.f2060b;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<gh2<?>> f3538b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<gh2<?>> f3539c;
    private final a d;
    private final b e;
    private volatile boolean f = false;
    private final lx1 g;

    public lf0(BlockingQueue<gh2<?>> blockingQueue, BlockingQueue<gh2<?>> blockingQueue2, a aVar, b bVar) {
        this.f3538b = blockingQueue;
        this.f3539c = blockingQueue2;
        this.d = aVar;
        this.e = bVar;
        this.g = new lx1(this);
    }

    private final void b() {
        b bVar;
        gh2<?> take = this.f3538b.take();
        take.a("cache-queue-take");
        take.a(1);
        try {
            take.f();
            m61 a2 = this.d.a(take.j());
            if (a2 == null) {
                take.a("cache-miss");
                if (!lx1.a(this.g, take)) {
                    this.f3539c.put(take);
                }
            } else if (a2.a()) {
                take.a("cache-hit-expired");
                take.a(a2);
                if (!lx1.a(this.g, take)) {
                    this.f3539c.put(take);
                }
                take.a(2);
            } else {
                take.a("cache-hit");
                ar2<?> a3 = take.a(new ef2(a2.f3669a, a2.g));
                take.a("cache-hit-parsed");
                if (!(a2.f < System.currentTimeMillis())) {
                    bVar = this.e;
                } else {
                    take.a("cache-hit-refresh-needed");
                    take.a(a2);
                    a3.d = true;
                    if (!lx1.a(this.g, take)) {
                        this.e.a(take, a3, new x52(this, take));
                        take.a(2);
                    }
                    bVar = this.e;
                }
                bVar.a(take, a3);
                take.a(2);
            }
        } finally {
            take.a(2);
        }
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    public final void run() {
        if (h) {
            c5.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.L();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c5.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
