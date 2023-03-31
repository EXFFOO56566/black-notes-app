package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.n;
import com.google.android.gms.ads.internal.q;

final class hd implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AdOverlayInfoParcel f2894b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ zzaol f2895c;

    hd(zzaol zzaol, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f2895c = zzaol;
        this.f2894b = adOverlayInfoParcel;
    }

    public final void run() {
        q.b();
        n.a(this.f2895c.f5827a, this.f2894b, true);
    }
}
