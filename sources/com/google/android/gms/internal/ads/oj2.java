package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

public final class oj2 {
    @GuardedBy("lock")

    /* renamed from: a  reason: collision with root package name */
    private jj2 f4007a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private boolean f4008b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f4009c;
    private final Object d = new Object();

    oj2(Context context) {
        this.f4009c = context;
    }

    /* access modifiers changed from: private */
    public final void a() {
        synchronized (this.d) {
            if (this.f4007a != null) {
                this.f4007a.i();
                this.f4007a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Future<InputStream> a(ij2 ij2) {
        rj2 rj2 = new rj2(this);
        qj2 qj2 = new qj2(this, ij2, rj2);
        uj2 uj2 = new uj2(this, rj2);
        synchronized (this.d) {
            jj2 jj2 = new jj2(this.f4009c, q.q().b(), qj2, uj2);
            this.f4007a = jj2;
            jj2.m();
        }
        return rj2;
    }
}
