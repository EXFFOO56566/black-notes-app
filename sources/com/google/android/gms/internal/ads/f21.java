package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class f21 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f2522a;

    private f21(Bundle bundle) {
        this.f2522a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!this.f2522a.isEmpty()) {
            bundle2.putBundle("installed_adapter_data", this.f2522a);
        }
    }
}
