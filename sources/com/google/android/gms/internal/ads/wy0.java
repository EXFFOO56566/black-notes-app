package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.e;
import javax.annotation.concurrent.GuardedBy;

public final class wy0 implements e {
    @GuardedBy("this")

    /* renamed from: a  reason: collision with root package name */
    private e f5333a;

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void a() {
        if (this.f5333a != null) {
            this.f5333a.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void a(View view) {
        if (this.f5333a != null) {
            this.f5333a.a(view);
        }
    }

    public final synchronized void a(e eVar) {
        this.f5333a = eVar;
    }

    @Override // com.google.android.gms.ads.internal.e
    public final synchronized void b() {
        if (this.f5333a != null) {
            this.f5333a.b();
        }
    }
}
