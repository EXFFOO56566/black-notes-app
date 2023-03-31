package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dj implements tj {

    /* renamed from: a  reason: collision with root package name */
    private final String f2263a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f2264b;

    dj(String str, Bundle bundle) {
        this.f2263a = str;
        this.f2264b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.tj
    public final void a(ev evVar) {
        evVar.c("am", this.f2263a, this.f2264b);
    }
}
