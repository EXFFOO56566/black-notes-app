package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class in2 extends ln2<eo2> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3117b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ um2 f3118c;
    private final /* synthetic */ String d;
    private final /* synthetic */ cn2 e;

    in2(cn2 cn2, Context context, um2 um2, String str) {
        this.e = cn2;
        this.f3117b = context;
        this.f3118c = um2;
        this.d = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 a() {
        cn2.a(this.f3117b, "search");
        return new rq2();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 a(oo2 oo2) {
        return oo2.a(b.a(this.f3117b), this.f3118c, this.d, 201004000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ eo2 b() {
        return this.e.f2144a.a(this.f3117b, this.f3118c, this.d, null, 3);
    }
}
