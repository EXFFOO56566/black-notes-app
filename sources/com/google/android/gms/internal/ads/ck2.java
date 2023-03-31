package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final class ck2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f2130b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f2131c;
    private final /* synthetic */ gh2 d;

    ck2(gh2 gh2, String str, long j) {
        this.d = gh2;
        this.f2130b = str;
        this.f2131c = j;
    }

    public final void run() {
        this.d.f2763b.a(this.f2130b, this.f2131c);
        this.d.f2763b.a(this.d.toString());
    }
}
