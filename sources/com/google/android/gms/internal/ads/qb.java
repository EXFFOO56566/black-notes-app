package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.mediation.d;
import com.google.android.gms.ads.mediation.o;

/* access modifiers changed from: package-private */
public final class qb implements d<o, Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ xa f4300a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ob f4301b;

    qb(ob obVar, xa xaVar) {
        this.f4301b = obVar;
        this.f4300a = xaVar;
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void b(String str) {
        try {
            String canonicalName = this.f4301b.f3972b.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 31 + String.valueOf(str).length());
            sb.append(canonicalName);
            sb.append("failed to loaded mediation ad: ");
            sb.append(str);
            co.a(sb.toString());
            this.f4300a.a(0, str);
            this.f4300a.a(0);
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
