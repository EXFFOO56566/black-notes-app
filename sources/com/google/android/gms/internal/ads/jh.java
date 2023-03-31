package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.x.b;

public final class jh implements b {

    /* renamed from: a  reason: collision with root package name */
    private final ug f3225a;

    public jh(ug ugVar) {
        this.f3225a = ugVar;
    }

    @Override // com.google.android.gms.ads.x.b
    public final int I() {
        ug ugVar = this.f3225a;
        if (ugVar == null) {
            return 0;
        }
        try {
            return ugVar.I();
        } catch (RemoteException e) {
            co.c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }

    @Override // com.google.android.gms.ads.x.b
    public final String m() {
        ug ugVar = this.f3225a;
        if (ugVar == null) {
            return null;
        }
        try {
            return ugVar.m();
        } catch (RemoteException e) {
            co.c("Could not forward getType to RewardItem", e);
            return null;
        }
    }
}
