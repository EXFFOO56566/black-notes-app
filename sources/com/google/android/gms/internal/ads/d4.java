package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import b.c.b.a.d.c;

public final class d4 extends c<i2> {
    public d4() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ i2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof i2 ? (i2) queryLocalInterface : new l2(iBinder);
    }
}
