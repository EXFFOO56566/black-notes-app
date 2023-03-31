package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class tq0 extends qq0 {
    private String g;
    private int h = zq0.f5795a;

    public tq0(Context context) {
        this.f = new gf(context, q.q().b(), this, this);
    }

    public final lo1<InputStream> a(zf zfVar) {
        synchronized (this.f4375b) {
            if (this.h != zq0.f5795a && this.h != zq0.f5796b) {
                return yn1.a((Throwable) new ar0(1));
            } else if (this.f4376c) {
                return this.f4374a;
            } else {
                this.h = zq0.f5796b;
                this.f4376c = true;
                this.e = zfVar;
                this.f.m();
                this.f4374a.a(new wq0(this), jo.f);
                return this.f4374a;
            }
        }
    }

    public final lo1<InputStream> a(String str) {
        synchronized (this.f4375b) {
            if (this.h != zq0.f5795a && this.h != zq0.f5797c) {
                return yn1.a((Throwable) new ar0(1));
            } else if (this.f4376c) {
                return this.f4374a;
            } else {
                this.h = zq0.f5797c;
                this.f4376c = true;
                this.g = str;
                this.f.m();
                this.f4374a.a(new vq0(this), jo.f);
                return this.f4374a;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qq0, com.google.android.gms.common.internal.c.b
    public final void a(b bVar) {
        co.a("Cannot connect to remote service, fallback to local instance.");
        this.f4374a.a(new ar0(0));
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        ro<InputStream> roVar;
        ar0 ar0;
        synchronized (this.f4375b) {
            if (!this.d) {
                this.d = true;
                try {
                    if (this.h == zq0.f5796b) {
                        this.f.A().b(this.e, new pq0(this));
                    } else if (this.h == zq0.f5797c) {
                        this.f.A().a(this.g, new pq0(this));
                    } else {
                        this.f4374a.a(new ar0(0));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    roVar = this.f4374a;
                    ar0 = new ar0(0);
                    roVar.a(ar0);
                } catch (Throwable th) {
                    q.g().a(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    roVar = this.f4374a;
                    ar0 = new ar0(0);
                    roVar.a(ar0);
                }
            }
        }
    }
}
