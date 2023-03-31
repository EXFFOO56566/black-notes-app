package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

public final class f3 extends h72 implements c3 {
    f3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.c3
    public final void a(s2 s2Var, String str) {
        Parcel r0 = r0();
        i72.a(r0, s2Var);
        r0.writeString(str);
        b(1, r0);
    }
}
