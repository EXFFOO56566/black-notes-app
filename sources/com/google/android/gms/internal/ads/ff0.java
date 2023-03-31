package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

public final class ff0 extends qp2 {

    /* renamed from: b  reason: collision with root package name */
    private final Object f2585b = new Object();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private rp2 f2586c;
    @Nullable
    private final hb d;

    public ff0(@Nullable rp2 rp2, @Nullable hb hbVar) {
        this.f2586c = rp2;
        this.d = hbVar;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final sp2 B0() {
        synchronized (this.f2585b) {
            if (this.f2586c == null) {
                return null;
            }
            return this.f2586c.B0();
        }
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float H() {
        hb hbVar = this.d;
        if (hbVar != null) {
            return hbVar.r1();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.rp2
    public final float N() {
        hb hbVar = this.d;
        if (hbVar != null) {
            return hbVar.g1();
        }
        return 0.0f;
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
        synchronized (this.f2585b) {
            if (this.f2586c != null) {
                this.f2586c.a(sp2);
            }
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
