package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import java.util.List;

public final class zi0 extends n2 {

    /* renamed from: b  reason: collision with root package name */
    private final String f5759b;

    /* renamed from: c  reason: collision with root package name */
    private final xe0 f5760c;
    private final if0 d;

    public zi0(String str, xe0 xe0, if0 if0) {
        this.f5759b = str;
        this.f5760c = xe0;
        this.d = if0;
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final String a() {
        return this.f5759b;
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final boolean a(Bundle bundle) {
        return this.f5760c.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final String b() {
        return this.d.g();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final void b(Bundle bundle) {
        this.f5760c.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final a c() {
        return this.d.B();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final String d() {
        return this.d.c();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final void d(Bundle bundle) {
        this.f5760c.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final void destroy() {
        this.f5760c.a();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final o1 e() {
        return this.d.A();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final String f() {
        return this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final Bundle g() {
        return this.d.f();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final rp2 getVideoController() {
        return this.d.n();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final List<?> h() {
        return this.d.h();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final double k() {
        return this.d.l();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final a n() {
        return b.a(this.f5760c);
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final String o() {
        return this.d.k();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final String r() {
        return this.d.m();
    }

    @Override // com.google.android.gms.internal.ads.k2
    public final v1 t() {
        return this.d.z();
    }
}
