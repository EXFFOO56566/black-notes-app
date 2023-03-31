package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* access modifiers changed from: package-private */
public final class vo1<V> extends sn1<V> {
    @NullableDecl
    private lo1<V> i;
    @NullableDecl
    private ScheduledFuture<?> j;

    private vo1(lo1<V> lo1) {
        jl1.a(lo1);
        this.i = lo1;
    }

    static <V> lo1<V> a(lo1<V> lo1, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        vo1 vo1 = new vo1(lo1);
        xo1 xo1 = new xo1(vo1);
        vo1.j = scheduledExecutorService.schedule(xo1, j2, timeUnit);
        lo1.a(xo1, rn1.INSTANCE);
        return vo1;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final void b() {
        a((Future<?>) this.i);
        ScheduledFuture<?> scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.i = null;
        this.j = null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xm1
    public final String d() {
        lo1<V> lo1 = this.i;
        ScheduledFuture<?> scheduledFuture = this.j;
        if (lo1 == null) {
            return null;
        }
        String valueOf = String.valueOf(lo1);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
