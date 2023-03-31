package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class qo1<V> extends wn1<V> implements lo1<V>, ScheduledFuture<V> {

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledFuture<?> f4367c;

    public qo1(lo1<V> lo1, ScheduledFuture<?> scheduledFuture) {
        super(lo1);
        this.f4367c = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.un1
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.f4367c.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f4367c.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f4367c.getDelay(timeUnit);
    }
}
