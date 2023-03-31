package com.google.android.gms.internal.ads;

import android.content.Context;

final /* synthetic */ class ww0 implements id0 {

    /* renamed from: a  reason: collision with root package name */
    private final lt0 f5329a;

    ww0(lt0 lt0) {
        this.f5329a = lt0;
    }

    @Override // com.google.android.gms.internal.ads.id0
    public final void a(boolean z, Context context) {
        lt0 lt0 = this.f5329a;
        try {
            lt0.f3600b.a(z);
            lt0.f3600b.b(context);
        } catch (fe1 e) {
            throw new hd0(e.getCause());
        }
    }
}
