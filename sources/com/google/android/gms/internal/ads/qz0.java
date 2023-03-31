package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class qz0 implements b80 {

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<lp2> f4418b = new AtomicReference<>();

    public final void a(lp2 lp2) {
        this.f4418b.set(lp2);
    }

    @Override // com.google.android.gms.internal.ads.b80
    public final void a(wm2 wm2) {
        cb1.a(this.f4418b, new tz0(wm2));
    }
}
