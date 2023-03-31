package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.mediation.d;

final class zc implements d<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ec f5734a;

    zc(wc wcVar, ec ecVar, xa xaVar) {
        this.f5734a = ecVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void b(String str) {
        try {
            this.f5734a.a(str);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
