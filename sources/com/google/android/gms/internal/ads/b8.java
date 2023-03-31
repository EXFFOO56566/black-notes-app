package com.google.android.gms.internal.ads;

final class b8 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f1884b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ t7 f1885c;

    b8(t7 t7Var, String str) {
        this.f1885c = t7Var;
        this.f1884b = str;
    }

    public final void run() {
        this.f1885c.f4762b.loadData(this.f1884b, "text/html", "UTF-8");
    }
}
