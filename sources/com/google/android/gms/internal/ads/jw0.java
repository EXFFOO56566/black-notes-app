package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.g50;

public final class jw0 extends gw0<ck0> {

    /* renamed from: a  reason: collision with root package name */
    private final kv f3285a;

    /* renamed from: b  reason: collision with root package name */
    private final g50.a f3286b;

    /* renamed from: c  reason: collision with root package name */
    private final k90 f3287c;

    public jw0(kv kvVar, g50.a aVar, k90 k90) {
        this.f3285a = kvVar;
        this.f3286b = aVar;
        this.f3287c = k90;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gw0
    public final lo1<ck0> a(zd1 zd1, Bundle bundle) {
        ik0 m = this.f3285a.m();
        g50.a aVar = this.f3286b;
        aVar.a(zd1);
        aVar.a(bundle);
        m.b(aVar.a());
        m.a(this.f3287c);
        return m.b().a().b();
    }
}
