package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class hn2 extends ln2<eo2> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f2949b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ um2 f2950c;
    private final /* synthetic */ String d;
    private final /* synthetic */ ra e;
    private final /* synthetic */ cn2 f;

    hn2(cn2 cn2, Context context, um2 um2, String str, ra raVar) {
        this.f = cn2;
        this.f2949b = context;
        this.f2950c = um2;
        this.d = str;
        this.e = raVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 a() {
        cn2.a(this.f2949b, "interstitial");
        return new rq2();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 a(oo2 oo2) {
        return oo2.b(b.a(this.f2949b), this.f2950c, this.d, this.e, 201004000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 b() {
        return this.f.f2144a.a(this.f2949b, this.f2950c, this.d, this.e, 2);
    }
}
