package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
public final class ms extends wr implements nr {
    private er e;
    private String f;
    private boolean g;
    private Exception h;
    private boolean i;

    public ms(gq gqVar, hq hqVar) {
        super(gqVar);
        er erVar = new er(gqVar.getContext(), hqVar);
        this.e = erVar;
        erVar.a((nr) this);
    }

    private static String b(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void c(String str) {
        synchronized (this) {
            this.g = true;
            notify();
            a();
        }
        String str2 = this.f;
        if (str2 != null) {
            String b2 = b(str2);
            Exception exc = this.h;
            if (exc != null) {
                a(this.f, b2, "badUrl", b(str, exc));
            } else {
                a(this.f, b2, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    @Override // com.google.android.gms.common.api.i, com.google.android.gms.internal.ads.wr
    public final void a() {
        er erVar = this.e;
        if (erVar != null) {
            erVar.a((nr) null);
            this.e.c();
        }
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(String str, Exception exc) {
        String str2 = (String) on2.e().a(zr2.j);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.h = exc;
        co.c("Precache error", exc);
        c(str);
    }

    @Override // com.google.android.gms.internal.ads.nr
    public final void a(boolean z, long j) {
        gq gqVar = this.d.get();
        if (gqVar != null) {
            jo.e.execute(new ks(gqVar, z, j));
        }
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final boolean a(String str) {
        return a(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (r33.h == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        throw r33.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw new java.io.IOException("Abort requested before buffering finished. ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0152, code lost:
        r0 = th;
     */
    @Override // com.google.android.gms.internal.ads.wr
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r34, java.lang.String[] r35) {
        /*
        // Method dump skipped, instructions count: 418
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ms.a(java.lang.String, java.lang.String[]):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.wr
    public final String b(String str) {
        String valueOf = String.valueOf(super.b(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void b() {
        c((String) null);
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void b(int i2) {
        this.e.e().c(i2);
    }

    public final er c() {
        synchronized (this) {
            this.i = true;
            notify();
        }
        this.e.a((nr) null);
        er erVar = this.e;
        this.e = null;
        return erVar;
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void c(int i2) {
        this.e.e().d(i2);
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void d(int i2) {
        this.e.e().a(i2);
    }

    @Override // com.google.android.gms.internal.ads.wr
    public final void e(int i2) {
        this.e.e().b(i2);
    }
}
