package com.google.android.gms.internal.ads;

import android.os.Looper;

/* access modifiers changed from: package-private */
public final class cq implements Runnable {
    cq(dq dqVar) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
