package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r61 implements v61 {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f4452a;

    r61(Bundle bundle) {
        this.f4452a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void a(Object obj) {
        ((Bundle) obj).putBundle("shared_pref", this.f4452a);
    }
}
