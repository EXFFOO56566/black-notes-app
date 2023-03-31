package com.google.android.gms.internal.ads;

final class x7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f5376b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ t7 f5377c;

    x7(t7 t7Var, String str) {
        this.f5377c = t7Var;
        this.f5376b = str;
    }

    public final void run() {
        this.f5377c.f4762b.loadData(this.f5376b, "text/html", "UTF-8");
    }
}
