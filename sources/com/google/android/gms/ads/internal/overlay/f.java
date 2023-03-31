package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.ws;

final /* synthetic */ class f implements iu {

    /* renamed from: a  reason: collision with root package name */
    private final c f1418a;

    f(c cVar) {
        this.f1418a = cVar;
    }

    @Override // com.google.android.gms.internal.ads.iu
    public final void a(boolean z) {
        ws wsVar = this.f1418a.d;
        if (wsVar != null) {
            wsVar.F();
        }
    }
}
