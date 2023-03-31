package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.fr2;
import com.google.android.gms.internal.ads.rp2;
import javax.annotation.concurrent.GuardedBy;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1455a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private rp2 f1456b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private a f1457c;

    public static abstract class a {
        public void a() {
        }

        public void a(boolean z) {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }
    }

    public final rp2 a() {
        rp2 rp2;
        synchronized (this.f1455a) {
            rp2 = this.f1456b;
        }
        return rp2;
    }

    public final void a(a aVar) {
        r.a(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f1455a) {
            this.f1457c = aVar;
            if (this.f1456b != null) {
                try {
                    this.f1456b.a(new fr2(aVar));
                } catch (RemoteException e) {
                    co.b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
        }
    }

    public final void a(rp2 rp2) {
        synchronized (this.f1455a) {
            this.f1456b = rp2;
            if (this.f1457c != null) {
                a(this.f1457c);
            }
        }
    }
}
