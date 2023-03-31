package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.d.a;
import javax.annotation.concurrent.GuardedBy;

public final class tu0 extends oh implements e70 {
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    private ph f4858b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private h70 f4859c;
    @GuardedBy("this")
    private ob0 d;

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void C(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.C(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void K(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.K(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void N(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.N(aVar);
        }
        if (this.d != null) {
            this.d.U();
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void a(a aVar, uh uhVar) {
        if (this.f4858b != null) {
            this.f4858b.a(aVar, uhVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final synchronized void a(h70 h70) {
        this.f4859c = h70;
    }

    public final synchronized void a(ob0 ob0) {
        this.d = ob0;
    }

    public final synchronized void a(ph phVar) {
        this.f4858b = phVar;
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void b(a aVar, int i) {
        if (this.f4858b != null) {
            this.f4858b.b(aVar, i);
        }
        if (this.d != null) {
            this.d.a(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void c(Bundle bundle) {
        if (this.f4858b != null) {
            this.f4858b.c(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void c(a aVar, int i) {
        if (this.f4858b != null) {
            this.f4858b.c(aVar, i);
        }
        if (this.f4859c != null) {
            this.f4859c.a(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void i(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.i(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void k(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.k(aVar);
        }
        if (this.f4859c != null) {
            this.f4859c.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void q(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.q(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void s(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.s(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.ph
    public final synchronized void z(a aVar) {
        if (this.f4858b != null) {
            this.f4858b.z(aVar);
        }
    }
}
