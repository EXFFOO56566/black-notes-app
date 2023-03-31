package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.g50;

public final class hw0 extends gw0<ac0> {

    /* renamed from: a  reason: collision with root package name */
    private final kv f2980a;

    /* renamed from: b  reason: collision with root package name */
    private final g50.a f2981b;

    /* renamed from: c  reason: collision with root package name */
    private final ry0 f2982c;
    private final k90 d;

    public hw0(kv kvVar, g50.a aVar, ry0 ry0, k90 k90) {
        this.f2980a = kvVar;
        this.f2981b = aVar;
        this.f2982c = ry0;
        this.d = k90;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gw0
    public final lo1<ac0> a(zd1 zd1, Bundle bundle) {
        zc0 k = this.f2980a.k();
        g50.a aVar = this.f2981b;
        aVar.a(zd1);
        aVar.a(bundle);
        k.c(aVar.a());
        k.c(this.d);
        k.a(this.f2982c);
        return k.e().a().b();
    }
}
