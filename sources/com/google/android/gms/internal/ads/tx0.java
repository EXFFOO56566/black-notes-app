package com.google.android.gms.internal.ads;

final /* synthetic */ class tx0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final qx0 f4875b;

    /* renamed from: c  reason: collision with root package name */
    private final vd1 f4876c;
    private final id1 d;
    private final lt0 e;

    tx0(qx0 qx0, vd1 vd1, id1 id1, lt0 lt0) {
        this.f4875b = qx0;
        this.f4876c = vd1;
        this.d = id1;
        this.e = lt0;
    }

    public final void run() {
        qx0 qx0 = this.f4875b;
        vd1 vd1 = this.f4876c;
        id1 id1 = this.d;
        lt0 lt0 = this.e;
        ox0 ox0 = qx0.d;
        ox0.c(vd1, id1, lt0);
    }
}
