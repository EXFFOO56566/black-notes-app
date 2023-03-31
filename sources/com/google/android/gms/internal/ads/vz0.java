package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

public final class vz0 implements u50, a60, n60, l70, jm2 {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private rn2 f5185b;

    @Override // com.google.android.gms.internal.ads.u50
    public final void A() {
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final synchronized void B() {
        if (this.f5185b != null) {
            try {
                this.f5185b.B();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdOpened.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final synchronized void G() {
        if (this.f5185b != null) {
            try {
                this.f5185b.G();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdLeftApplication.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final synchronized void K() {
        if (this.f5185b != null) {
            try {
                this.f5185b.K();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdImpression.", e);
            }
        }
    }

    public final synchronized rn2 a() {
        return this.f5185b;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final synchronized void a(int i) {
        if (this.f5185b != null) {
            try {
                this.f5185b.a(i);
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdFailedToLoad.", e);
            }
        }
    }

    public final synchronized void a(rn2 rn2) {
        this.f5185b = rn2;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void a(ug ugVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final synchronized void l() {
        if (this.f5185b != null) {
            try {
                this.f5185b.l();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdClicked.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final synchronized void s() {
        if (this.f5185b != null) {
            try {
                this.f5185b.s();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdLoaded.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final synchronized void x() {
        if (this.f5185b != null) {
            try {
                this.f5185b.x();
            } catch (RemoteException e) {
                co.c("Remote Exception at onAdClosed.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final void y() {
    }
}
