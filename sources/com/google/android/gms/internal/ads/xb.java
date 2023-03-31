package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import b.c.a.a;

final class xb implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ a f5398b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vb f5399c;

    xb(vb vbVar, a aVar) {
        this.f5399c = vbVar;
        this.f5398b = aVar;
    }

    public final void run() {
        try {
            vb.a(this.f5399c).a(ac.a(this.f5398b));
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
        }
    }
}
