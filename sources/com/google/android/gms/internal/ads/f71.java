package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

public final class f71 implements v61<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    private final String f2547a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2548b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2549c;
    private final int d;
    private final boolean e;
    private final int f;

    public f71(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f2547a = str;
        this.f2548b = i;
        this.f2549c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f2547a;
        boolean z = true;
        ee1.a(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f2548b);
        if (this.f2548b == -2) {
            z = false;
        }
        ee1.a(bundle2, "cnt", valueOf, z);
        bundle2.putInt("gnt", this.f2549c);
        bundle2.putInt("pt", this.d);
        Bundle a2 = ee1.a(bundle2, "device");
        bundle2.putBundle("device", a2);
        Bundle a3 = ee1.a(a2, "network");
        a2.putBundle("network", a3);
        a3.putInt("active_network_state", this.f);
        a3.putBoolean("active_network_metered", this.e);
    }
}
