package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.g50;

public final class fw0 extends gw0<n00> {

    /* renamed from: a  reason: collision with root package name */
    private final kv f2664a;

    /* renamed from: b  reason: collision with root package name */
    private final g50.a f2665b;

    /* renamed from: c  reason: collision with root package name */
    private final ry0 f2666c;
    private final k90 d;
    private final vd0 e;
    private final e80 f;
    private final ViewGroup g;

    public fw0(kv kvVar, g50.a aVar, ry0 ry0, k90 k90, vd0 vd0, e80 e80, ViewGroup viewGroup) {
        this.f2664a = kvVar;
        this.f2665b = aVar;
        this.f2666c = ry0;
        this.d = k90;
        this.e = vd0;
        this.f = e80;
        this.g = viewGroup;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.gw0
    public final lo1<n00> a(zd1 zd1, Bundle bundle) {
        j10 h = this.f2664a.h();
        g50.a aVar = this.f2665b;
        aVar.a(zd1);
        aVar.a(bundle);
        h.d(aVar.a());
        h.b(this.d);
        h.b(this.f2666c);
        h.a(this.e);
        h.a(new h20(this.f));
        h.a(new i00(this.g));
        return h.a().a().b();
    }
}
