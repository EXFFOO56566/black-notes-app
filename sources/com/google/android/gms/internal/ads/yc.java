package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.j;

final class yc implements d<j, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ fc f5573a;

    yc(wc wcVar, fc fcVar, xa xaVar) {
        this.f5573a = fcVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void b(String str) {
        try {
            this.f5573a.a(str);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
