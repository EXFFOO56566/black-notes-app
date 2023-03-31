package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import b.c.b.a.d.b;
import b.c.b.a.f.a.a;
import java.util.List;
import java.util.Map;

public final class ga extends hv {

    /* renamed from: b  reason: collision with root package name */
    private final a f2727b;

    ga(a aVar) {
        this.f2727b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String A0() {
        return this.f2727b.f();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String T0() {
        return this.f2727b.d();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final Map a(String str, String str2, boolean z) {
        return this.f2727b.a(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void a(b.c.b.a.d.a aVar, String str, String str2) {
        this.f2727b.a(aVar != null ? (Activity) b.Q(aVar) : null, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void a(String str, String str2, Bundle bundle) {
        this.f2727b.a(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void a(String str, String str2, b.c.b.a.d.a aVar) {
        this.f2727b.a(str, str2, aVar != null ? b.Q(aVar) : null);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final List b(String str, String str2) {
        return this.f2727b.a(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void c(String str, String str2, Bundle bundle) {
        this.f2727b.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void f(Bundle bundle) {
        this.f2727b.a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void g(Bundle bundle) {
        this.f2727b.c(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final Bundle i(Bundle bundle) {
        return this.f2727b.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void o(String str) {
        this.f2727b.a(str);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String q1() {
        return this.f2727b.c();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final long w1() {
        return this.f2727b.a();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final void y(String str) {
        this.f2727b.b(str);
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String y0() {
        return this.f2727b.b();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final String y1() {
        return this.f2727b.e();
    }

    @Override // com.google.android.gms.internal.ads.ev
    public final int z(String str) {
        return this.f2727b.c(str);
    }
}
