package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class p41 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f4108a;

    public p41(Bundle bundle) {
        this.f4108a = bundle;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a2 = ee1.a(bundle2, "device");
        a2.putBundle("android_mem_info", this.f4108a);
        bundle2.putBundle("device", a2);
    }
}
