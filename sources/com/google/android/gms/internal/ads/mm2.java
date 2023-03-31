package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.b;
import b.c.b.a.d.c;

public final class mm2 extends c<co2> {
    public mm2() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final xn2 a(Context context, String str, ra raVar) {
        try {
            IBinder a2 = ((co2) a(context)).a(b.a(context), str, raVar, 201004000);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof xn2 ? (xn2) queryLocalInterface : new zn2(a2);
        } catch (RemoteException | c.a e) {
            co.c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ co2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof co2 ? (co2) queryLocalInterface : new bo2(iBinder);
    }
}
