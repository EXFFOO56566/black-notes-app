package com.google.android.gms.internal.ads;

import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;

final class hu0 extends dc {

    /* renamed from: b  reason: collision with root package name */
    private lt0<qc, uu0> f2976b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ gu0 f2977c;

    private hu0(gu0 gu0, lt0<qc, uu0> lt0) {
        this.f2977c = gu0;
        this.f2976b = lt0;
    }

    @Override // com.google.android.gms.internal.ads.ec
    public final void J(a aVar) {
        this.f2977c.f2813c = (View) b.Q(aVar);
        ((uu0) this.f2976b.f3601c).s();
    }

    @Override // com.google.android.gms.internal.ads.ec
    public final void a(String str) {
        ((uu0) this.f2976b.f3601c).a(0, str);
    }
}
