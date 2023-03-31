package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.w;

final class bd implements d<w, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ kc f1923a;

    bd(wc wcVar, kc kcVar, xa xaVar) {
        this.f1923a = kcVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void b(String str) {
        try {
            this.f1923a.a(str);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
