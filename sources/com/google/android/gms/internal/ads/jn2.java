package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class jn2 extends ln2<vo2> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3254b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ cn2 f3255c;

    jn2(cn2 cn2, Context context) {
        this.f3255c = cn2;
        this.f3254b = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ vo2 a() {
        cn2.a(this.f3254b, "mobile_ads_settings");
        return new tq2();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ vo2 a(oo2 oo2) {
        return oo2.d(b.a(this.f3254b), 201004000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ vo2 b() {
        return this.f3255c.f2146c.b(this.f3254b);
    }
}
