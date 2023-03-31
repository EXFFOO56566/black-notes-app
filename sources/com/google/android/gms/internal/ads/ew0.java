package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.g50;

public final class ew0 extends gw0<q20> {

    /* renamed from: a  reason: collision with root package name */
    private final kv f2488a;

    /* renamed from: b  reason: collision with root package name */
    private final vd0 f2489b;

    /* renamed from: c  reason: collision with root package name */
    private final g50.a f2490c;
    private final k90 d;

    public ew0(kv kvVar, vd0 vd0, g50.a aVar, k90 k90) {
        this.f2488a = kvVar;
        this.f2489b = vd0;
        this.f2490c = aVar;
        this.d = k90;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gw0
    public final lo1<q20> a(zd1 zd1, Bundle bundle) {
        yd0 l = this.f2488a.l();
        g50.a aVar = this.f2490c;
        aVar.a(zd1);
        aVar.a(bundle);
        l.a(aVar.a());
        l.e(this.d);
        l.b(this.f2489b);
        return l.c().a().b();
    }
}
