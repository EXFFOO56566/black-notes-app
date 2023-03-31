package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.i;

/* access modifiers changed from: package-private */
public final class tk0 implements i {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ pk0 f4828b;

    tk0(pk0 pk0) {
        this.f4828b = pk0;
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void K() {
        this.f4828b.f.onPause();
    }

    @Override // com.google.android.gms.ads.internal.i
    public final void p() {
        this.f4828b.f.onResume();
    }
}
