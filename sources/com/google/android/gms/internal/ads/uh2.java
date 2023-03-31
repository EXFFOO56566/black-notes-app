package com.google.android.gms.internal.ads;

import com.github.ajalt.reprint.module.spass.BuildConfig;

final class uh2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ vh2 f4955b;

    uh2(vh2 vh2) {
        this.f4955b = vh2;
    }

    public final void run() {
        synchronized (this.f4955b.d) {
            if (!(this.f4955b.e) || !(this.f4955b.f)) {
                co.a("App is still foreground");
            } else {
                this.f4955b.e = false;
                co.a("App went background");
                for (xh2 xh2 : this.f4955b.g) {
                    try {
                        xh2.a(false);
                    } catch (Exception e) {
                        co.b(BuildConfig.FLAVOR, e);
                    }
                }
            }
        }
    }
}
