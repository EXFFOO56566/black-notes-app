package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class en2 extends ln2<eo2> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f2456b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ um2 f2457c;
    private final /* synthetic */ String d;
    private final /* synthetic */ ra e;
    private final /* synthetic */ cn2 f;

    en2(cn2 cn2, Context context, um2 um2, String str, ra raVar) {
        this.f = cn2;
        this.f2456b = context;
        this.f2457c = um2;
        this.d = str;
        this.e = raVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 a() {
        cn2.a(this.f2456b, "banner");
        return new rq2();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 a(oo2 oo2) {
        return oo2.c(b.a(this.f2456b), this.f2457c, this.d, this.e, 201004000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 b() {
        return this.f.f2144a.a(this.f2456b, this.f2457c, this.d, this.e, 1);
    }
}
