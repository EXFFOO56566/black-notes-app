package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public final class cd2 extends Thread {

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<gh2<?>> f2103b;

    /* renamed from: c  reason: collision with root package name */
    private final de2 f2104c;
    private final a d;
    private final b e;
    private volatile boolean f = false;

    public cd2(BlockingQueue<gh2<?>> blockingQueue, de2 de2, a aVar, b bVar) {
        this.f2103b = blockingQueue;
        this.f2104c = de2;
        this.d = aVar;
        this.e = bVar;
    }

    private final void b() {
        gh2<?> take = this.f2103b.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.a(3);
        try {
            take.a("network-queue-take");
            take.f();
            TrafficStats.setThreadStatsTag(take.h());
            ef2 a2 = this.f2104c.a(take);
            take.a("network-http-complete");
            if (!a2.e || !take.r()) {
                ar2<?> a3 = take.a(a2);
                take.a("network-parse-complete");
                if (take.n() && a3.f1807b != null) {
                    this.d.a(take.j(), a3.f1807b);
                    take.a("network-cache-written");
                }
                take.q();
                this.e.a(take, a3);
                take.a(a3);
                take.a(4);
                return;
            }
            take.b("not-modified");
            take.s();
        } catch (e3 e2) {
            e2.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.e.a(take, e2);
            take.s();
        } catch (Exception e3) {
            c5.a(e3, "Unhandled exception %s", e3.toString());
            e3 e3Var = new e3(e3);
            e3Var.a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.e.a(take, e3Var);
            take.s();
        } finally {
            take.a(4);
        }
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c5.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
