package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* access modifiers changed from: package-private */
public final class pg2 implements Handler.Callback, Choreographer.FrameCallback {
    private static final pg2 g = new pg2();

    /* renamed from: b  reason: collision with root package name */
    public volatile long f4172b;

    /* renamed from: c  reason: collision with root package name */
    private final sk1 f4173c;
    private final HandlerThread d;
    private Choreographer e;
    private int f;

    private pg2() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.d = handlerThread;
        handlerThread.start();
        sk1 sk1 = new sk1(this.d.getLooper(), this);
        this.f4173c = sk1;
        sk1.sendEmptyMessage(0);
    }

    public static pg2 c() {
        return g;
    }

    public final void a() {
        this.f4173c.sendEmptyMessage(1);
    }

    public final void b() {
        this.f4173c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f4172b = j;
        this.e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
                this.e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                this.e.removeFrameCallback(this);
                this.f4172b = 0;
            }
            return true;
        }
    }
}
