package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.v61;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class g51<S extends v61<?>> implements y61<S> {

    /* renamed from: a  reason: collision with root package name */
    private final y61<S> f2710a;

    /* renamed from: b  reason: collision with root package name */
    private final long f2711b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f2712c;

    public g51(y61<S> y61, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f2710a = y61;
        this.f2711b = j;
        this.f2712c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<S> a() {
        lo1<S> a2 = this.f2710a.a();
        long j = this.f2711b;
        if (j > 0) {
            a2 = yn1.a(a2, j, TimeUnit.MILLISECONDS, this.f2712c);
        }
        return yn1.a(a2, Throwable.class, j51.f3179a, jo.f);
    }
}
