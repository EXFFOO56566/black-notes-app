package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.a.a;

final class zb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a f5727b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vb f5728c;

    zb(vb vbVar, a aVar) {
        this.f5728c = vbVar;
        this.f5727b = aVar;
    }

    public final void run() {
        try {
            vb.a(this.f5728c).a(ac.a(this.f5727b));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }
}
