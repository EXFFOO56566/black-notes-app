package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.b;
import b.c.b.a.d.c;

public final class pm2 extends c<go2> {
    public pm2() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final eo2 a(Context context, um2 um2, String str, ra raVar, int i) {
        try {
            IBinder a2 = ((go2) a(context)).a(b.a(context), um2, str, raVar, 201004000, i);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface instanceof eo2 ? (eo2) queryLocalInterface : new ho2(a2);
        } catch (RemoteException | c.a e) {
            co.a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ go2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof go2 ? (go2) queryLocalInterface : new jo2(iBinder);
    }
}
