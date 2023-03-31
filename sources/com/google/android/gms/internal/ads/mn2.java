package com.google.android.gms.internal.ads;

import android.content.Context;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class mn2 extends ln2<bh> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f3733b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ ra f3734c;
    private final /* synthetic */ cn2 d;

    mn2(cn2 cn2, Context context, ra raVar) {
        this.d = cn2;
        this.f3733b = context;
        this.f3734c = raVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ bh a() {
        cn2.a(this.f3733b, "rewarded_video");
        return new wq2();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ bh a(oo2 oo2) {
        return oo2.b(b.a(this.f3733b), this.f3734c, 201004000);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ bh b() {
        return this.d.d.a(this.f3733b, this.f3734c);
    }
}
