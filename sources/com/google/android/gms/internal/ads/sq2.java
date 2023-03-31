package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* access modifiers changed from: package-private */
public final class sq2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ pq2 f4695b;

    sq2(pq2 pq2) {
        this.f4695b = pq2;
    }

    public final void run() {
        if (this.f4695b.f4220b.f3880b != null) {
            try {
                this.f4695b.f4220b.f3880b.a(1);
            } catch (RemoteException e) {
                co.c("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
