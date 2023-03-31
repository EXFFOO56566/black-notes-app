package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

public final class sz0 implements jm2 {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private qn2 f4730b;

    public final synchronized void a(qn2 qn2) {
        this.f4730b = qn2;
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final synchronized void l() {
        if (this.f4730b != null) {
            try {
                this.f4730b.l();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdClicked.", e);
            }
        }
    }
}
