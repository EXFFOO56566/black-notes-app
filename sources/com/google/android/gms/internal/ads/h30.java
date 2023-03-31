package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.o;
import java.util.concurrent.atomic.AtomicBoolean;

public final class h30 implements o {

    /* renamed from: b  reason: collision with root package name */
    private final v60 f2848b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicBoolean f2849c = new AtomicBoolean(false);

    public h30(v60 v60) {
        this.f2848b = v60;
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void I() {
        this.f2849c.set(true);
        this.f2848b.R();
    }

    public final boolean a() {
        return this.f2849c.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.o
    public final void p() {
        this.f2848b.T();
    }
}
