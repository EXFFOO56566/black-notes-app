package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class sk1 extends Handler {
    public sk1() {
    }

    public sk1(Looper looper) {
        super(looper);
    }

    public sk1(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    /* access modifiers changed from: protected */
    public void a(Message message) {
        super.dispatchMessage(message);
    }

    public final void dispatchMessage(Message message) {
        a(message);
    }
}
