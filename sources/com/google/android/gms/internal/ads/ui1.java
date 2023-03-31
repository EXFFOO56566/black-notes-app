package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import b.c.b.a.c.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.internal.ads.q00;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public final class ui1 implements c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    private rj1 f4959a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4960b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4961c;
    private final a72 d;
    private final int e = 1;
    private final LinkedBlockingQueue<hk1> f;
    private final HandlerThread g;
    private final ji1 h;
    private final long i;

    public ui1(Context context, int i2, a72 a72, String str, String str2, String str3, ji1 ji1) {
        this.f4960b = str;
        this.d = a72;
        this.f4961c = str2;
        this.h = ji1;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.g = handlerThread;
        handlerThread.start();
        this.i = System.currentTimeMillis();
        this.f4959a = new rj1(context, this.g.getLooper(), this, this, 19621000);
        this.f = new LinkedBlockingQueue<>();
        this.f4959a.m();
    }

    private final void a() {
        rj1 rj1 = this.f4959a;
        if (rj1 == null) {
            return;
        }
        if (rj1.a() || this.f4959a.f()) {
            this.f4959a.i();
        }
    }

    private final void a(int i2, long j, Exception exc) {
        ji1 ji1 = this.h;
        if (ji1 != null) {
            ji1.a(i2, System.currentTimeMillis() - j, exc);
        }
    }

    private final yj1 b() {
        try {
            return this.f4959a.A();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static hk1 c() {
        return new hk1(null, 1);
    }

    public final hk1 a(int i2) {
        hk1 hk1;
        try {
            hk1 = this.f.poll(50000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            a(2009, this.i, e2);
            hk1 = null;
        }
        a(3004, this.i, null);
        if (hk1 != null) {
            ji1.a(hk1.d == 7 ? q00.c.DISABLED : q00.c.ENABLED);
        }
        return hk1 == null ? c() : hk1;
    }

    @Override // com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
        try {
            a(4012, this.i, null);
            this.f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void b(int i2) {
        try {
            a(4011, this.i, null);
            this.f.put(c());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        yj1 b2 = b();
        if (b2 != null) {
            try {
                hk1 a2 = b2.a(new fk1(this.e, this.d, this.f4960b, this.f4961c));
                a(5011, this.i, null);
                this.f.put(a2);
            } catch (Throwable th) {
                a();
                this.g.quit();
                throw th;
            }
            a();
            this.g.quit();
        }
    }
}
