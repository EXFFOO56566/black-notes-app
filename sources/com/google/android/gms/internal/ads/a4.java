package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import b.c.b.a.d.c;

public final class a4 extends c<f2> {
    public a4() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ f2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof f2 ? (f2) queryLocalInterface : new e2(iBinder);
    }
}
