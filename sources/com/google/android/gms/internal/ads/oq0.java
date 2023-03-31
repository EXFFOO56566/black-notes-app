package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import b.c.b.a.c.b;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class oq0 extends qq0 {
    public oq0(Context context) {
        this.f = new gf(context, q.q().b(), this, this);
    }

    public final lo1<InputStream> a(zf zfVar) {
        synchronized (this.f4375b) {
            if (this.f4376c) {
                return this.f4374a;
            }
            this.f4376c = true;
            this.e = zfVar;
            this.f.m();
            this.f4374a.a(new nq0(this), jo.f);
            return this.f4374a;
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
                    this.f.A().a(this.e, new pq0(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    roVar = this.f4374a;
                    ar0 = new ar0(0);
                } catch (Throwable th) {
                    q.g().a(th, "RemoteAdRequestClientTask.onConnected");
                    roVar = this.f4374a;
                    ar0 = new ar0(0);
                }
            }
        }
        roVar.a(ar0);
    }
}
