package com.google.android.gms.internal.ads;

import android.os.Bundle;

public final class g31 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final double f2698a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2699b;

    public g31(double d, boolean z) {
        this.f2698a = d;
        this.f2699b = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle a2 = ee1.a(bundle2, "device");
        bundle2.putBundle("device", a2);
        Bundle a3 = ee1.a(a2, "battery");
        a2.putBundle("battery", a3);
        a3.putBoolean("is_charging", this.f2699b);
        a3.putDouble("battery_level", this.f2698a);
    }
}
