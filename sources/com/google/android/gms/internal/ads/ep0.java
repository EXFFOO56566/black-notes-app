package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final class ep0 extends j6 {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Object f2464b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f2465c;
    private final /* synthetic */ long d;
    private final /* synthetic */ ro e;
    private final /* synthetic */ uo0 f;

    ep0(uo0 uo0, Object obj, String str, long j, ro roVar) {
        this.f = uo0;
        this.f2464b = obj;
        this.f2465c = str;
        this.d = j;
        this.e = roVar;
    }

    @Override // com.google.android.gms.internal.ads.g6
    public final void U() {
        synchronized (this.f2464b) {
            this.f.a((uo0) this.f2465c, (String) true, (boolean) BuildConfig.FLAVOR, (String) ((int) (q.j().b() - this.d)));
            this.f.k.b(this.f2465c);
            this.e.b(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.g6
    public final void m(String str) {
        synchronized (this.f2464b) {
            this.f.a((uo0) this.f2465c, (String) false, (boolean) str, (String) ((int) (q.j().b() - this.d)));
            this.f.k.a(this.f2465c, "error");
            this.e.b(false);
        }
    }
}
