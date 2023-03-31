package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.internal.ads.ba0;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class si1 implements c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    private rj1 f4663a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4664b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4665c;
    private final LinkedBlockingQueue<ba0> d = new LinkedBlockingQueue<>();
    private final HandlerThread e;

    public si1(Context context, String str, String str2) {
        this.f4664b = str;
        this.f4665c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        this.f4663a = new rj1(context, this.e.getLooper(), this, this, 9200000);
        this.f4663a.m();
    }

    private final void a() {
        rj1 rj1 = this.f4663a;
        if (rj1 == null) {
            return;
        }
        if (rj1.a() || this.f4663a.f()) {
            this.f4663a.i();
        }
    }

    private final yj1 b() {
        try {
            return this.f4663a.A();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static ba0 c() {
        ba0.a x = ba0.x();
        x.u(32768);
        return (ba0) ((rz1) x.e());
    }

    public final ba0 a(int i) {
        ba0 ba0;
        try {
            ba0 = this.d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            ba0 = null;
        }
        return ba0 == null ? c() : ba0;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
        try {
            this.d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(int i) {
        try {
            this.d.put(c());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        a();
        r3.e.quit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r3.d.put(c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0025 */
    @Override // com.google.android.gms.common.internal.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.os.Bundle r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.yj1 r4 = r3.b()
            if (r4 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.uj1 r0 = new com.google.android.gms.internal.ads.uj1     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.f4664b     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = r3.f4665c     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.wj1 r4 = r4.a(r0)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.ba0 r4 = r4.d()     // Catch:{ all -> 0x0025 }
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.ba0> r0 = r3.d     // Catch:{ all -> 0x0025 }
            r0.put(r4)     // Catch:{ all -> 0x0025 }
        L_0x001c:
            r3.a()
            android.os.HandlerThread r4 = r3.e
            r4.quit()
            return
        L_0x0025:
            java.util.concurrent.LinkedBlockingQueue<com.google.android.gms.internal.ads.ba0> r4 = r3.d     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            com.google.android.gms.internal.ads.ba0 r0 = c()     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            r4.put(r0)     // Catch:{ InterruptedException -> 0x001c, all -> 0x002f }
            goto L_0x001c
        L_0x002f:
            r4 = move-exception
            r3.a()
            android.os.HandlerThread r0 = r3.e
            r0.quit()
            throw r4
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.si1.e(android.os.Bundle):void");
    }
}
