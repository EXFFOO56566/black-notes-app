package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final class mb extends qp2 {

    /* renamed from: b  reason: collision with root package name */
    private final Object f3685b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private volatile sp2 f3686c;

    @Override // com.google.android.gms.internal.ads.rp2
    public final sp2 B0() {
        sp2 sp2;
        synchronized (this.f3685b) {
            sp2 = this.f3686c;
        }
        return sp2;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float H() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float N() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float Q() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final int T() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean V0() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void a(sp2 sp2) {
        synchronized (this.f3685b) {
            this.f3686c = sp2;
        }
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void e(boolean z) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void i1() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean j1() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void p() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final void stop() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final boolean w0() {
        throw new RemoteException();
    }
}
