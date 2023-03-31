package com.google.android.gms.internal.ads;

import android.app.Activity;
import b.c.b.a.d.b;

/* access modifiers changed from: package-private */
public final class fn2 extends ln2<be> {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Activity f2631b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ cn2 f2632c;

    fn2(cn2 cn2, Activity activity) {
        this.f2632c = cn2;
        this.f2631b = activity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ be a() {
        cn2.a(this.f2631b, "ad_overlay");
        return null;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ be a(oo2 oo2) {
        return oo2.g(b.a(this.f2631b));
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.ads.ln2
    public final /* synthetic */ be b() {
        return this.f2632c.e.a(this.f2631b);
    }
}
