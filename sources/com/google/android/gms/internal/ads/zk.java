package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.q;

public final class zk extends sk1 {
    public zk(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.sk1
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            q.c();
            gl.a(q.g().a(), th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            q.g().a(e, "AdMobHandler.handleMessage");
        }
    }
}
