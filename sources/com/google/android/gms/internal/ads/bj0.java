package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import java.util.List;

public final class bj0 extends r2 {

    /* renamed from: b  reason: collision with root package name */
    private final String f1958b;

    /* renamed from: c  reason: collision with root package name */
    private final xe0 f1959c;
    private final if0 d;

    public bj0(String str, xe0 xe0, if0 if0) {
        this.f1958b = str;
        this.f1959c = xe0;
        this.d = if0;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String a() {
        return this.f1958b;
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final boolean a(Bundle bundle) {
        return this.f1959c.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String b() {
        return this.d.g();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void b(Bundle bundle) {
        this.f1959c.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final a c() {
        return this.d.B();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String d() {
        return this.d.c();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void d(Bundle bundle) {
        this.f1959c.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final v1 d0() {
        return this.d.C();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final void destroy() {
        this.f1959c.a();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final o1 e() {
        return this.d.A();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String f() {
        return this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final Bundle g() {
        return this.d.f();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final rp2 getVideoController() {
        return this.d.n();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final List<?> h() {
        return this.d.h();
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final a n() {
        return b.a(this.f1959c);
    }

    @Override // com.google.android.gms.internal.ads.o2
    public final String q() {
        return this.d.b();
    }
}
