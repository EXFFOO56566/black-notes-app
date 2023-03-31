package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class lm0 implements a60, n60, l70, m80, g90, jm2 {

    /* renamed from: b  reason: collision with root package name */
    private final wj2 f3577b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private boolean f3578c = false;

    public lm0(wj2 wj2, @Nullable tb1 tb1) {
        this.f3577b = wj2;
        wj2.a(yj2.AD_REQUEST);
        if (tb1 != null) {
            wj2.a(yj2.REQUEST_IS_PREFETCH);
        }
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void C() {
        this.f3577b.a(yj2.REQUEST_FAILED_TO_LOAD_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final synchronized void K() {
        this.f3577b.a(yj2.AD_IMPRESSION);
    }

    @Override // com.google.android.gms.internal.ads.a60
    public final void a(int i) {
        wj2 wj2;
        yj2 yj2;
        switch (i) {
            case 1:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_INVALID_REQUEST;
                break;
            case 2:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_NETWORK_ERROR;
                break;
            case 3:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_NO_FILL;
                break;
            case 4:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_TIMEOUT;
                break;
            case 5:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_CANCELLED;
                break;
            case 6:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_NO_ERROR;
                break;
            case 7:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD_NOT_FOUND;
                break;
            default:
                wj2 = this.f3577b;
                yj2 = yj2.AD_FAILED_TO_LOAD;
                break;
        }
        wj2.a(yj2);
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void a(ok2 ok2) {
        this.f3577b.a(new qm0(ok2));
        this.f3577b.a(yj2.REQUEST_SAVED_TO_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(vd1 vd1) {
        this.f3577b.a(new om0(vd1));
    }

    @Override // com.google.android.gms.internal.ads.m80
    public final void a(zf zfVar) {
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void a(boolean z) {
        this.f3577b.a(z ? yj2.REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED : yj2.REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void b(ok2 ok2) {
        this.f3577b.a(new pm0(ok2));
        this.f3577b.a(yj2.REQUEST_PREFETCH_INTERCEPTED);
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void c(ok2 ok2) {
        this.f3577b.a(new nm0(ok2));
        this.f3577b.a(yj2.REQUEST_LOADED_FROM_CACHE);
    }

    @Override // com.google.android.gms.internal.ads.g90
    public final void d(boolean z) {
        this.f3577b.a(z ? yj2.NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED : yj2.NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED);
    }

    @Override // com.google.android.gms.internal.ads.jm2
    public final synchronized void l() {
        if (!this.f3578c) {
            this.f3577b.a(yj2.AD_FIRST_CLICK);
            this.f3578c = true;
            return;
        }
        this.f3577b.a(yj2.AD_SUBSEQUENT_CLICK);
    }

    @Override // com.google.android.gms.internal.ads.l70
    public final void s() {
        this.f3577b.a(yj2.AD_LOADED);
    }
}
