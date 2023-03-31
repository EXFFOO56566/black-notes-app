package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;

final class fd implements o {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzaol f2575b;

    fd(zzaol zzaol) {
        this.f2575b = zzaol;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        co.a("AdMobCustomTabsAdapter overlay is closed.");
        this.f2575b.f5828b.c(this.f2575b);
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
        co.a("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
        co.a("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
        co.a("Opening AdMobCustomTabsAdapter overlay.");
        this.f2575b.f5828b.e(this.f2575b);
    }
}
