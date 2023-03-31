package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.o;

/* access modifiers changed from: package-private */
public final class cd implements d<o, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ lc f2099a;

    cd(wc wcVar, lc lcVar, xa xaVar) {
        this.f2099a = lcVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void b(String str) {
        try {
            this.f2099a.a(str);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
