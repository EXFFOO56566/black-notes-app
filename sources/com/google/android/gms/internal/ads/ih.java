package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.b;
import b.c.b.a.d.c;

public final class ih extends c<ch> {
    public ih() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final bh a(Context context, ra raVar) {
        try {
            IBinder a2 = ((ch) a(context)).a(b.a(context), raVar, 201004000);
            if (a2 == null) {
                return null;
            }
            IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return queryLocalInterface instanceof bh ? (bh) queryLocalInterface : new dh(a2);
        } catch (RemoteException | c.a e) {
            co.c("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ ch a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return queryLocalInterface instanceof ch ? (ch) queryLocalInterface : new fh(iBinder);
    }
}
