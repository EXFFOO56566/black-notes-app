package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.q;

public final class vx implements r42<xi1> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<Context> f5177a;

    public vx(e52<Context> e52) {
        this.f5177a = e52;
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        xi1 xi1 = new xi1(this.f5177a.get(), q.q().b());
        y42.a(xi1, "Cannot return null from a non-@Nullable @Provides method");
        return xi1;
    }
}
