package com.google.android.gms.internal.ads;

import android.os.RemoteException;

final /* synthetic */ class a01 implements a60 {

    /* renamed from: b  reason: collision with root package name */
    private final vz0 f1670b;

    /* renamed from: c  reason: collision with root package name */
    private final x6 f1671c;

    a01(vz0 vz0, x6 x6Var) {
        this.f1670b = vz0;
        this.f1671c = x6Var;
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i) {
        vz0 vz0 = this.f1670b;
        x6 x6Var = this.f1671c;
        vz0.a(i);
        if (x6Var != null) {
            try {
                x6Var.i(i);
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        }
    }
}
