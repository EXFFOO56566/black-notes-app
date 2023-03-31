package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final class uq2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ rq2 f4988b;

    uq2(rq2 rq2) {
        this.f4988b = rq2;
    }

    public final void run() {
        if (this.f4988b.f4537b != null) {
            try {
                this.f4988b.f4537b.a(1);
            } catch (RemoteException e) {
                co.c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
