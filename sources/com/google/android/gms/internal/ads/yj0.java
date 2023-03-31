package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.p;

public final class yj0 extends p.a {

    /* renamed from: a  reason: collision with root package name */
    private final if0 f5605a;

    public yj0(if0 if0) {
        this.f5605a = if0;
    }

    private static sp2 a(if0 if0) {
        rp2 n = if0.n();
        if (n == null) {
            return null;
        }
        try {
            return n.B0();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.p.a
    public final void a() {
        sp2 a2 = a(this.f5605a);
        if (a2 != null) {
            try {
                a2.o0();
            } catch (RemoteException e) {
                co.c("Unable to call onVideoEnd()", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p.a
    public final void b() {
        sp2 a2 = a(this.f5605a);
        if (a2 != null) {
            try {
                a2.W();
            } catch (RemoteException e) {
                co.c("Unable to call onVideoEnd()", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.p.a
    public final void d() {
        sp2 a2 = a(this.f5605a);
        if (a2 != null) {
            try {
                a2.O0();
            } catch (RemoteException e) {
                co.c("Unable to call onVideoEnd()", e);
            }
        }
    }
}
