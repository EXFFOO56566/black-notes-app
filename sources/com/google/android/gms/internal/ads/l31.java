package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class l31 implements y61<v61<Bundle>> {

    /* renamed from: a  reason: collision with root package name */
    private final wa1 f3491a;

    l31(wa1 wa1) {
        this.f3491a = wa1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<v61<Bundle>> a() {
        wa1 wa1 = this.f3491a;
        return yn1.a((wa1 == null || wa1.a() == null || this.f3491a.a().isEmpty()) ? null : new o31(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bundle bundle) {
        bundle.putString("key_schema", this.f3491a.a());
    }
}
