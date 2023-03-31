package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class x82 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5385b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f5386c;
    private final /* synthetic */ long d;
    private final /* synthetic */ v82 e;

    x82(v82 v82, String str, long j, long j2) {
        this.e = v82;
        this.f5385b = str;
        this.f5386c = j;
        this.d = j2;
    }

    public final void run() {
        this.e.f5066b.a(this.f5385b, this.f5386c, this.d);
    }
}
