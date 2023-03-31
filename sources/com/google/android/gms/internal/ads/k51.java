package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class k51 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f3326a;

    public k51(Bundle bundle) {
        this.f3326a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.f3326a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
