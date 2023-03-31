package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

public final class wj extends h72 implements uj {
    wj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.uj
    public final void b(String str, String str2, Bundle bundle) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        i72.a(r0, bundle);
        b(3, r0);
    }

    @Override // com.google.android.gms.internal.ads.uj
    public final void c(String str, String str2) {
        Parcel r0 = r0();
        r0.writeString(str);
        r0.writeString(str2);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.uj
    public final void d(String str) {
        Parcel r0 = r0();
        r0.writeString(str);
        b(2, r0);
    }
}
