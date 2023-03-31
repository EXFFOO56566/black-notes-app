package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class kn2 extends ln2<xn2> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3422b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f3423c;
    private final /* synthetic */ ra d;
    private final /* synthetic */ cn2 e;

    kn2(cn2 cn2, Context context, String str, ra raVar) {
        this.e = cn2;
        this.f3422b = context;
        this.f3423c = str;
        this.d = raVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ xn2 a() {
        cn2.a(this.f3422b, "native_ad");
        return new nq2();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ xn2 a(oo2 oo2) {
        return oo2.b(b.a(this.f3422b), this.f3423c, this.d, 201004000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ xn2 b() {
        return this.e.f2145b.a(this.f3422b, this.f3423c, this.d);
    }
}
