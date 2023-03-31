package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

public final class zz0 {

    /* renamed from: a  reason: collision with root package name */
    private final d01<k20> f5824a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5825b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private mp2 f5826c;
    @GuardedBy("this")
    private boolean d;

    public zz0(d01<k20> d01, String str) {
        this.f5824a = d01;
        this.f5825b = str;
    }

    public final synchronized String a() {
        try {
            if (this.f5826c == null) {
                return null;
            }
            return this.f5826c.a();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final synchronized void a(rm2 rm2, int i) {
        this.f5826c = null;
        this.f5824a.a(rm2, this.f5825b, new e01(i), new yz0(this));
    }

    public final synchronized boolean b() {
        return this.f5824a.u();
    }

    public final synchronized String c() {
        try {
            if (this.f5826c == null) {
                return null;
            }
            return this.f5826c.a();
        } catch (RemoteException e) {
            co.d("#007 Could not call remote method.", e);
            return null;
        }
    }
}
