package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* access modifiers changed from: package-private */
public final class ow0 implements zn1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f4055a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f4056b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ id1 f4057c;
    private final /* synthetic */ kd1 d;
    private final /* synthetic */ lw0 e;

    ow0(lw0 lw0, String str, long j, id1 id1, kd1 kd1) {
        this.e = lw0;
        this.f4055a = str;
        this.f4056b = j;
        this.f4057c = id1;
        this.d = kd1;
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(T t) {
        long b2 = this.e.f3614a.b();
        this.e.a(this.f4055a, 0, b2 - this.f4056b, this.f4057c.X);
        if (this.e.d) {
            this.e.f3615b.a(this.d, this.f4057c, 0, null, b2 - this.f4056b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zn1
    public final void a(Throwable th) {
        long b2 = this.e.f3614a.b();
        int i = 6;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof aw0) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof fe1) {
            i = 5;
        } else if ((th instanceof gp0) && ((gp0) th).a() == 3) {
            i = 1;
        }
        this.e.a(this.f4055a, i, b2 - this.f4056b, this.f4057c.X);
        if (this.e.d) {
            this.e.f3615b.a(this.d, this.f4057c, i, th instanceof nt0 ? (nt0) th : null, b2 - this.f4056b);
        }
    }
}
