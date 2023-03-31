package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

/* access modifiers changed from: package-private */
public final class tu implements o {

    /* renamed from: b  reason: collision with root package name */
    private ws f4856b;

    /* renamed from: c  reason: collision with root package name */
    private o f4857c;

    public tu(ws wsVar, o oVar) {
        this.f4856b = wsVar;
        this.f4857c = oVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.f4857c.I();
        this.f4856b.o();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
        this.f4857c.p();
        this.f4856b.F();
    }
}
