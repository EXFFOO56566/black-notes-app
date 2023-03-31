package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.x.a;

final class vc1 extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ gp2 f5087a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ wc1 f5088b;

    vc1(wc1 wc1, gp2 gp2) {
        this.f5088b = wc1;
        this.f5087a = gp2;
    }

    @Override // com.google.android.gms.ads.x.a
    public final void a() {
        if (this.f5088b.g != null) {
            try {
                this.f5087a.O();
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        }
    }
}
