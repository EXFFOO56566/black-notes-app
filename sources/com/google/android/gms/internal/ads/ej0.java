package com.google.android.gms.internal.ads;

import android.os.Bundle;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import java.util.Collections;
import java.util.List;

public final class ej0 extends z3 {

    /* renamed from: b  reason: collision with root package name */
    private final String f2435b;

    /* renamed from: c  reason: collision with root package name */
    private final xe0 f2436c;
    private final if0 d;

    public ej0(String str, xe0 xe0, if0 if0) {
        this.f2435b = str;
        this.f2436c = xe0;
        this.d = if0;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final List<?> H0() {
        return v1() ? this.d.j() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void N1() {
        this.f2436c.h();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void X() {
        this.f2436c.f();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String a() {
        return this.f2435b;
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(cp2 cp2) {
        this.f2436c.a(cp2);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(lp2 lp2) {
        this.f2436c.a(lp2);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(v3 v3Var) {
        this.f2436c.a(v3Var);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void a(yo2 yo2) {
        this.f2436c.a(yo2);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean a(Bundle bundle) {
        return this.f2436c.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String b() {
        return this.d.g();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void b(Bundle bundle) {
        this.f2436c.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final u1 b0() {
        return this.f2436c.l().a();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final a c() {
        return this.d.B();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String d() {
        return this.d.c();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void d(Bundle bundle) {
        this.f2436c.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void destroy() {
        this.f2436c.a();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final o1 e() {
        return this.d.A();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String f() {
        return this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final Bundle g() {
        return this.d.f();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final rp2 getVideoController() {
        return this.d.n();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final List<?> h() {
        return this.d.h();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final void i0() {
        this.f2436c.o();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final mp2 j() {
        if (!((Boolean) on2.e().a(zr2.A3)).booleanValue()) {
            return null;
        }
        return this.f2436c.d();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final double k() {
        return this.d.l();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final a n() {
        return b.a(this.f2436c);
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean n0() {
        return this.f2436c.g();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String o() {
        return this.d.k();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String q() {
        return this.d.b();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final String r() {
        return this.d.m();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final v1 t() {
        return this.d.z();
    }

    @Override // com.google.android.gms.internal.ads.w3
    public final boolean v1() {
        return !this.d.j().isEmpty() && this.d.r() != null;
    }
}
