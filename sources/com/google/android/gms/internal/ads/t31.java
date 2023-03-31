package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import javax.annotation.Nullable;

public final class t31 implements v61<Bundle> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final Location f4748a;

    public t31(@Nullable Location location) {
        this.f4748a = location;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.v61
    public final /* synthetic */ void a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f4748a != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", this.f4748a.getAccuracy() * 1000.0f);
            bundle3.putLong("lat", (long) (this.f4748a.getLatitude() * 1.0E7d));
            bundle3.putLong("long", (long) (this.f4748a.getLongitude() * 1.0E7d));
            bundle3.putLong("time", this.f4748a.getTime() * 1000);
            bundle2.putBundle("uule", bundle3);
        }
    }
}
