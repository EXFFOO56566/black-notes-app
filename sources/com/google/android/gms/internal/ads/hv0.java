package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class hv0 implements id0 {

    /* renamed from: a  reason: collision with root package name */
    private final lt0 f2979a;

    hv0(lt0 lt0) {
        this.f2979a = lt0;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void a(boolean z, Context context) {
        lt0 lt0 = this.f2979a;
        try {
            lt0.f3600b.a(z);
            lt0.f3600b.g();
        } catch (fe1 e) {
            co.c("Cannot show interstitial.");
            throw new hd0(e.getCause());
        }
    }
}
