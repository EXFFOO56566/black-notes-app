package com.google.android.gms.internal.ads;

final class bd2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ hd2 f1925b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ad2 f1926c;

    bd2(ad2 ad2, hd2 hd2) {
        this.f1926c = ad2;
        this.f1925b = hd2;
    }

    public final void run() {
        this.f1925b.a();
        int size = ad2.d(this.f1926c).size();
        for (int i = 0; i < size; i++) {
            ((vd2) ad2.d(this.f1926c).valueAt(i)).a();
        }
    }
}
