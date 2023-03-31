package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

public final class vf extends h72 implements tf {
    vf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel r0 = r0();
        i72.a(r0, parcelFileDescriptor);
        b(1, r0);
    }

    @Override // com.google.android.gms.internal.ads.tf
    public final void a(lm lmVar) {
        Parcel r0 = r0();
        i72.a(r0, lmVar);
        b(2, r0);
    }
}
