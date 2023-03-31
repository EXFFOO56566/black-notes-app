package com.google.android.gms.internal.ads;

/* access modifiers changed from: package-private */
public final /* synthetic */ class gj implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cj f2768b;

    /* renamed from: c  reason: collision with root package name */
    private final tj f2769c;
    private final String d;

    gj(cj cjVar, tj tjVar, String str) {
        this.f2768b = cjVar;
        this.f2769c = tjVar;
        this.d = str;
    }

    public final void run() {
        this.f2768b.a(this.f2769c, this.d);
    }
}
