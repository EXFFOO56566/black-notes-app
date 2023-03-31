package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;

public final class sq0 extends qq0 {
    public sq0(Context context) {
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
            this.f4374a.a(new rq0(this), jo.f);
            return this.f4374a;
        }
    }

    @Override // com.google.android.gms.common.internal.c.a
    public final void e(Bundle bundle) {
        ro<InputStream> roVar;
        ar0 ar0;
        synchronized (this.f4375b) {
            if (!this.d) {
                this.d = true;
                try {
                    this.f.A().c(this.e, new pq0(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    roVar = this.f4374a;
                    ar0 = new ar0(0);
                } catch (Throwable th) {
                    q.g().a(th, "RemoteSignalsClientTask.onConnected");
                    roVar = this.f4374a;
                    ar0 = new ar0(0);
                }
            }
        }
        roVar.a(ar0);
    }
}
