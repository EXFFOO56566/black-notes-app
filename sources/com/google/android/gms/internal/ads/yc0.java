package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

public final class yc0 implements o {

    /* renamed from: b  reason: collision with root package name */
    private final t70 f5574b;

    /* renamed from: c  reason: collision with root package name */
    private final wa0 f5575c;

    public yc0(t70 t70, wa0 wa0) {
        this.f5574b = t70;
        this.f5575c = wa0;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.f5574b.I();
        this.f5575c.R();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
        this.f5574b.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
        this.f5574b.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
        this.f5574b.p();
        this.f5575c.S();
    }
}
