package com.google.android.gms.internal.ads;

import java.io.IOException;

final class fd2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IOException f2582b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ad2 f2583c;

    fd2(ad2 ad2, IOException iOException) {
        this.f2583c = ad2;
        this.f2582b = iOException;
    }

    public final void run() {
        ad2.e(this.f2583c).a(this.f2582b);
    }
}
