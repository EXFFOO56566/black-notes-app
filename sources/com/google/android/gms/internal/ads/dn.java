package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.r;

public final class dn {

    /* renamed from: a  reason: collision with root package name */
    private HandlerThread f2280a = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f2281b = null;

    /* renamed from: c  reason: collision with root package name */
    private int f2282c = 0;
    private final Object d = new Object();

    public final Handler a() {
        return this.f2281b;
    }

    public final Looper b() {
        Looper looper;
        synchronized (this.d) {
            if (this.f2282c != 0) {
                r.a(this.f2280a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f2280a == null) {
                wk.e("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f2280a = handlerThread;
                handlerThread.start();
                this.f2281b = new sk1(this.f2280a.getLooper());
                wk.e("Looper thread started.");
            } else {
                wk.e("Resuming the looper thread");
                this.d.notifyAll();
            }
            this.f2282c++;
            looper = this.f2280a.getLooper();
        }
        return looper;
    }
}
