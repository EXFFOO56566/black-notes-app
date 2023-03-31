package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class a92 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f1727b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f1728c;
    private final /* synthetic */ long d;
    private final /* synthetic */ v82 e;

    a92(v82 v82, int i, long j, long j2) {
        this.e = v82;
        this.f1727b = i;
        this.f1728c = j;
        this.d = j2;
    }

    public final void run() {
        this.e.f5066b.a(this.f1727b, this.f1728c, this.d);
    }
}
