package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.c;
import javax.annotation.concurrent.GuardedBy;

public final class zi2 {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f5763a = new dj2(this);

    /* renamed from: b  reason: collision with root package name */
    private final Object f5764b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private jj2 f5765c;
    @GuardedBy("lock")
    private Context d;
    @GuardedBy("lock")
    private nj2 e;

    private final synchronized jj2 a(c.a aVar, c.b bVar) {
        return new jj2(this.d, q.q().b(), aVar, bVar);
    }

    /* access modifiers changed from: private */
    public final void b() {
        synchronized (this.f5764b) {
            if (this.d != null) {
                if (this.f5765c == null) {
                    jj2 a2 = a(new fj2(this), new ej2(this));
                    this.f5765c = a2;
                    a2.m();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void c() {
        synchronized (this.f5764b) {
            if (this.f5765c != null) {
                if (this.f5765c.a() || this.f5765c.f()) {
                    this.f5765c.i();
                }
                this.f5765c = null;
                this.e = null;
                Binder.flushPendingCommands();
            }
        }
    }

    public final hj2 a(ij2 ij2) {
        synchronized (this.f5764b) {
            if (this.e == null) {
                return new hj2();
            }
            try {
                return this.e.a(ij2);
            } catch (RemoteException e2) {
                co.b("Unable to call into cache service.", e2);
                return new hj2();
            }
        }
    }

    public final void a() {
        if (((Boolean) on2.e().a(zr2.K1)).booleanValue()) {
            synchronized (this.f5764b) {
                b();
                q.c();
                gl.h.removeCallbacks(this.f5763a);
                q.c();
                gl.h.postDelayed(this.f5763a, ((Long) on2.e().a(zr2.L1)).longValue());
            }
        }
    }

    public final void a(Context context) {
        if (context != null) {
            synchronized (this.f5764b) {
                if (this.d == null) {
                    this.d = context.getApplicationContext();
                    if (((Boolean) on2.e().a(zr2.J1)).booleanValue()) {
                        b();
                    } else {
                        if (((Boolean) on2.e().a(zr2.I1)).booleanValue()) {
                            q.f().a(new bj2(this));
                        }
                    }
                }
            }
        }
    }
}
