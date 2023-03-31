package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class f20 implements l70, fh2 {

    /* renamed from: b  reason: collision with root package name */
    private final id1 f2520b;

    /* renamed from: c  reason: collision with root package name */
    private final m60 f2521c;
    private final p70 d;
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicBoolean f = new AtomicBoolean();

    public f20(id1 id1, m60 m60, p70 p70) {
        this.f2520b = id1;
        this.f2521c = m60;
        this.d = p70;
    }

    private final void j() {
        if (this.e.compareAndSet(false, true)) {
            this.f2521c.K();
        }
    }

    @Override // com.google.android.gms.internal.ads.fh2
    public final void a(hh2 hh2) {
        if (this.f2520b.e == 1 && hh2.j) {
            j();
        }
        if (hh2.j && this.f.compareAndSet(false, true)) {
            this.d.M0();
        }
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final synchronized void s() {
        if (this.f2520b.e != 1) {
            j();
        }
    }
}
