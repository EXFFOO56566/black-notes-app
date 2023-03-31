package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class t41 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final gd1 f4751a;

    public t41(gd1 gd1) {
        this.f4751a = gd1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        gd1 gd1 = this.f4751a;
        if (gd1 != null) {
            bundle2.putBoolean("render_in_browser", gd1.a());
            bundle2.putBoolean("disable_ml", this.f4751a.b());
        }
    }
}
