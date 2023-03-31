package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a80 extends j90<b80> implements n60, q70 {

    /* renamed from: c  reason: collision with root package name */
    private final id1 f1715c;
    private AtomicBoolean d = new AtomicBoolean();

    public a80(Set<ab0<b80>> set, id1 id1) {
        super(set);
        this.f1715c = id1;
    }

    private final void R() {
        wm2 wm2;
        if (((Boolean) on2.e().a(zr2.H3)).booleanValue() && this.d.compareAndSet(false, true) && (wm2 = this.f1715c.W) != null && wm2.f5294b == 3) {
            a(new y70(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void K() {
        int i = this.f1715c.f3067b;
        if (i == 2 || i == 5 || i == 4) {
            R();
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void M0() {
        if (this.f1715c.f3067b == 1) {
            R();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(b80 b80) {
        b80.a(this.f1715c.W);
    }
}
