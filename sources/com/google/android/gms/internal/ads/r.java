package com.google.android.gms.internal.ads;

import android.view.View;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.google.android.gms.ads.internal.e;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class r extends s {

    /* renamed from: b  reason: collision with root package name */
    private final e f4421b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4422c;
    private final String d;

    public r(e eVar, String str, String str2) {
        this.f4421b = eVar;
        this.f4422c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.internal.ads.t
    public final String L1() {
        return this.f4422c;
    }

    @Override // com.google.android.gms.internal.ads.t
    public final String a2() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.t
    public final void d1() {
        this.f4421b.a();
    }

    @Override // com.google.android.gms.internal.ads.t
    public final void i() {
        this.f4421b.b();
    }

    @Override // com.google.android.gms.internal.ads.t
    public final void t(a aVar) {
        if (aVar != null) {
            this.f4421b.a((View) b.Q(aVar));
        }
    }
}
