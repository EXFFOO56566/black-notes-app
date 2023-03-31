package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class w extends h72 implements u {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.u
    public final void a(t tVar) {
        Parcel r0 = r0();
        i72.a(r0, tVar);
        b(1, r0);
    }
}
