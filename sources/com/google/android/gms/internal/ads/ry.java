package com.google.android.gms.internal.ads;

import android.content.Context;

public final class ry implements q60 {

    /* renamed from: b  reason: collision with root package name */
    private final le1 f4567b;

    public ry(le1 le1) {
        this.f4567b = le1;
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void a(Context context) {
        try {
            this.f4567b.a();
        } catch (fe1 e) {
            co.c("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void b(Context context) {
        try {
            this.f4567b.f();
            if (context != null) {
                this.f4567b.a(context);
            }
        } catch (fe1 e) {
            co.c("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.q60
    public final void d(Context context) {
        try {
            this.f4567b.e();
        } catch (fe1 e) {
            co.c("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
