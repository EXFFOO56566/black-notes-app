package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.b;
import b.c.b.a.d.c;

public final class oq2 extends c<wo2> {
    public oq2() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ wo2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof wo2 ? (wo2) queryLocalInterface : new zo2(iBinder);
    }

    public final vo2 b(Context context) {
        try {
            IBinder e = ((wo2) a(context)).e(b.a(context), 201004000);
            if (e == null) {
                return null;
            }
            IInterface queryLocalInterface = e.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof vo2 ? (vo2) queryLocalInterface : new xo2(e);
        } catch (RemoteException | c.a e2) {
            co.c("Could not get remote MobileAdsSettingManager.", e2);
            return null;
        }
    }
}
