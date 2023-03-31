package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.e;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public final class rt extends qp2 {

    /* renamed from: b  reason: collision with root package name */
    private final gq f4542b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f4543c = new Object();
    private final boolean d;
    private final boolean e;
    @GuardedBy("lock")
    private int f;
    @GuardedBy("lock")
    private sp2 g;
    @GuardedBy("lock")
    private boolean h;
    @GuardedBy("lock")
    private boolean i = true;
    @GuardedBy("lock")
    private float j;
    @GuardedBy("lock")
    private float k;
    @GuardedBy("lock")
    private float l;
    @GuardedBy("lock")
    private boolean m;
    @GuardedBy("lock")
    private boolean n;
    @GuardedBy("lock")
    private j3 o;

    public rt(gq gqVar, float f2, boolean z, boolean z2) {
        this.f4542b = gqVar;
        this.j = f2;
        this.d = z;
        this.e = z2;
    }

    private final void a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        jo.e.execute(new qt(this, hashMap));
    }

    private final void b(int i2, int i3, boolean z, boolean z2) {
        jo.e.execute(new tt(this, i2, i3, z, z2));
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final sp2 B0() {
        sp2 sp2;
        synchronized (this.f4543c) {
            sp2 = this.g;
        }
        return sp2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float H() {
        float f2;
        synchronized (this.f4543c) {
            f2 = this.j;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float N() {
        float f2;
        synchronized (this.f4543c) {
            f2 = this.k;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float Q() {
        float f2;
        synchronized (this.f4543c) {
            f2 = this.l;
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final int T() {
        int i2;
        synchronized (this.f4543c) {
            i2 = this.f;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean V0() {
        boolean z;
        synchronized (this.f4543c) {
            z = this.i;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r4, float r5, int r6, boolean r7, float r8) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4543c
            monitor-enter(r0)
            float r1 = r3.j     // Catch:{ all -> 0x004f }
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0012
            float r1 = r3.l     // Catch:{ all -> 0x004f }
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r1 = 0
            goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            r3.j = r5     // Catch:{ all -> 0x004f }
            r3.k = r4     // Catch:{ all -> 0x004f }
            boolean r4 = r3.i     // Catch:{ all -> 0x004f }
            r3.i = r7     // Catch:{ all -> 0x004f }
            int r5 = r3.f     // Catch:{ all -> 0x004f }
            r3.f = r6     // Catch:{ all -> 0x004f }
            float r2 = r3.l     // Catch:{ all -> 0x004f }
            r3.l = r8     // Catch:{ all -> 0x004f }
            float r8 = r8 - r2
            float r8 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x004f }
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0038
            com.google.android.gms.internal.ads.gq r8 = r3.f4542b     // Catch:{ all -> 0x004f }
            android.view.View r8 = r8.getView()     // Catch:{ all -> 0x004f }
            r8.invalidate()     // Catch:{ all -> 0x004f }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.j3 r8 = r3.o     // Catch:{ RemoteException -> 0x0045 }
            if (r8 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.j3 r8 = r3.o     // Catch:{ RemoteException -> 0x0045 }
            r8.Q1()     // Catch:{ RemoteException -> 0x0045 }
            goto L_0x004b
        L_0x0045:
            r8 = move-exception
            java.lang.String r0 = "#007 Could not call remote method."
            com.google.android.gms.internal.ads.co.d(r0, r8)
        L_0x004b:
            r3.b(r5, r6, r4, r7)
            return
        L_0x004f:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rt.a(float, float, int, boolean, float):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, boolean z, boolean z2) {
        synchronized (this.f4543c) {
            boolean z3 = false;
            boolean z4 = i2 != i3;
            boolean z5 = !this.h && i3 == 1;
            boolean z6 = z4 && i3 == 1;
            boolean z7 = z4 && i3 == 2;
            boolean z8 = z4 && i3 == 3;
            boolean z9 = z != z2;
            if (this.h || z5) {
                z3 = true;
            }
            this.h = z3;
            if (z5) {
                try {
                    if (this.g != null) {
                        this.g.O0();
                    }
                } catch (RemoteException e2) {
                    co.d("#007 Could not call remote method.", e2);
                }
            }
            if (z6 && this.g != null) {
                this.g.Z();
            }
            if (z7 && this.g != null) {
                this.g.W();
            }
            if (z8) {
                if (this.g != null) {
                    this.g.o0();
                }
                this.f4542b.I();
            }
            if (z9 && this.g != null) {
                this.g.b(z2);
            }
        }
    }

    public final void a(j3 j3Var) {
        synchronized (this.f4543c) {
            this.o = j3Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void a(sp2 sp2) {
        synchronized (this.f4543c) {
            this.g = sp2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Map map) {
        this.f4542b.a("pubVideoCmd", map);
    }

    public final void b(float f2) {
        synchronized (this.f4543c) {
            this.k = f2;
        }
    }

    public final void b(er2 er2) {
        boolean z = er2.f2477b;
        boolean z2 = er2.f2478c;
        boolean z3 = er2.d;
        synchronized (this.f4543c) {
            this.m = z2;
            this.n = z3;
        }
        a("initialState", e.a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    public final void b2() {
        boolean z;
        int i2;
        synchronized (this.f4543c) {
            z = this.i;
            i2 = this.f;
            this.f = 3;
        }
        b(i2, 3, z, z);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void e(boolean z) {
        a(z ? "mute" : "unmute", null);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void i1() {
        a("play", null);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean j1() {
        boolean z;
        synchronized (this.f4543c) {
            z = this.d && this.m;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void p() {
        a("pause", null);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void stop() {
        a("stop", null);
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean w0() {
        boolean z;
        boolean j1 = j1();
        synchronized (this.f4543c) {
            if (!j1) {
                try {
                    if (this.n && this.e) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z = false;
        }
        return z;
    }
}
