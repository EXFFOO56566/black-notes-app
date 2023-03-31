package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import b.c.b.a.d.b;
import b.c.b.a.d.c;

public final class zd extends c<ce> {
    public zd() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final be a(Activity activity) {
        try {
            IBinder E = ((ce) a((Context) activity)).E(b.a(activity));
            if (E == null) {
                return null;
            }
            IInterface queryLocalInterface = E.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof be ? (be) queryLocalInterface : new de(E);
        } catch (RemoteException e) {
            co.c("Could not create remote AdOverlay.", e);
            return null;
        } catch (c.a e2) {
            co.c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // b.c.b.a.d.c
    public final /* synthetic */ ce a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof ce ? (ce) queryLocalInterface : new fe(iBinder);
    }
}
