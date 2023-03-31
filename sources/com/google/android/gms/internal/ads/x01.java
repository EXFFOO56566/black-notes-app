package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.github.ajalt.reprint.module.spass.BuildConfig;

final class x01 implements zn1<l11> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ uj f5342a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ o01 f5343b;

    x01(o01 o01, uj ujVar) {
        this.f5343b = o01;
        this.f5342a = ujVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zn1
    public final /* synthetic */ void a(l11 l11) {
        l11 l112 = l11;
        try {
            if (((Boolean) on2.e().a(zr2.E3)).booleanValue()) {
                if (this.f5343b.e.d >= ((Integer) on2.e().a(zr2.G3)).intValue()) {
                    if (l112 == null) {
                        this.f5342a.b(null, null, null);
                        return;
                    } else {
                        this.f5342a.b(l112.f3483a, l112.f3484b, l112.f3485c);
                        return;
                    }
                }
            }
            if (l112 == null) {
                this.f5342a.c(null, null);
            } else {
                this.f5342a.c(l112.f3483a, l112.f3484b);
            }
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        try {
            uj ujVar = this.f5342a;
            String valueOf = String.valueOf(th.getMessage());
            ujVar.d(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            co.b(BuildConfig.FLAVOR, e);
        }
    }
}
