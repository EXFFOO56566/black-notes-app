package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class tg2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f4809b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f4810c;
    private final /* synthetic */ long d;
    private final /* synthetic */ rg2 e;

    tg2(rg2 rg2, String str, long j, long j2) {
        this.e = rg2;
        this.f4809b = str;
        this.f4810c = j;
        this.d = j2;
    }

    public final void run() {
        this.e.f4502b.a(this.f4809b, this.f4810c, this.d);
    }
}
