package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.x.a;

final class ed1 extends a {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ io2 f2402a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ cd1 f2403b;

    ed1(cd1 cd1, io2 io2) {
        this.f2403b = cd1;
        this.f2402a = io2;
    }

    @Override // com.google.android.gms.ads.x.a
    public final void a() {
        if (this.f2403b.e != null) {
            try {
                this.f2402a.O();
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        }
    }
}
