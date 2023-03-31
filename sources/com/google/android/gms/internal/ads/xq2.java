package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class xq2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ wq2 f5481b;

    xq2(wq2 wq2) {
        this.f5481b = wq2;
    }

    public final void run() {
        if (this.f5481b.f5308b != null) {
            try {
                this.f5481b.f5308b.c(1);
            } catch (RemoteException e) {
                co.c("Could not notify onRewardedVideoAdFailedToLoad event.", e);
            }
        }
    }
}
