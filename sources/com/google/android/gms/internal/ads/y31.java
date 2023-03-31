package com.google.android.gms.internal.ads;

import android.location.Location;

final /* synthetic */ class y31 implements xk1 {

    /* renamed from: a  reason: collision with root package name */
    private final w31 f5534a;

    y31(w31 w31) {
        this.f5534a = w31;
    }

    @Override // com.google.android.gms.internal.ads.xk1
    public final Object a(Object obj) {
        Location location = (Location) obj;
        return location != null ? location : this.f5534a.e.d.l;
    }
}
