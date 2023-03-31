package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;

@TargetApi(16)
public final class qg2 {

    /* renamed from: a  reason: collision with root package name */
    private final pg2 f4327a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4328b;

    /* renamed from: c  reason: collision with root package name */
    private final long f4329c;
    private final long d;
    private long e;
    private long f;
    private long g;
    private boolean h;
    private long i;
    private long j;
    private long k;

    private qg2(double d2) {
        long j2;
        boolean z = d2 != -1.0d;
        this.f4328b = z;
        if (z) {
            this.f4327a = pg2.c();
            long j3 = (long) (1.0E9d / d2);
            this.f4329c = j3;
            j2 = (j3 * 80) / 100;
        } else {
            this.f4327a = null;
            j2 = -1;
            this.f4329c = -1;
        }
        this.d = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qg2(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L_0x0018
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L_0x001a
        L_0x0018:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x001a:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qg2.<init>(android.content.Context):void");
    }

    private final boolean b(long j2, long j3) {
        return Math.abs((j3 - this.i) - (j2 - this.j)) > 20000000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (b(r0, r14) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(long r12, long r14) {
        /*
        // Method dump skipped, instructions count: 133
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qg2.a(long, long):long");
    }

    public final void a() {
        if (this.f4328b) {
            this.f4327a.b();
        }
    }

    public final void b() {
        this.h = false;
        if (this.f4328b) {
            this.f4327a.a();
        }
    }
}
