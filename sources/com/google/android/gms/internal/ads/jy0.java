package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.e;
import java.util.concurrent.atomic.AtomicBoolean;

public final class jy0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final t50 f3293a;

    /* renamed from: b  reason: collision with root package name */
    private final m60 f3294b;

    /* renamed from: c  reason: collision with root package name */
    private final eb0 f3295c;
    private final za0 d;
    private final ez e;
    private AtomicBoolean f = new AtomicBoolean(false);

    jy0(t50 t50, m60 m60, eb0 eb0, za0 za0, ez ezVar) {
        this.f3293a = t50;
        this.f3294b = m60;
        this.f3295c = eb0;
        this.d = za0;
        this.e = ezVar;
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void a() {
        if (this.f.get()) {
            this.f3293a.l();
        }
    }

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void a(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.K();
            this.d.a(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.e
    public final void b() {
        if (this.f.get()) {
            this.f3294b.K();
            this.f3295c.R();
        }
    }
}
