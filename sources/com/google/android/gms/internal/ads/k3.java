package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class k3 extends h72 implements i3 {
    k3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.i3
    public final void a(s2 s2Var) {
        Parcel r0 = r0();
        i72.a(r0, s2Var);
        b(1, r0);
    }
}
