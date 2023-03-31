package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.List;

public final class b91 {

    /* renamed from: a  reason: collision with root package name */
    private final zf f1895a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1896b;

    public b91(zf zfVar, int i) {
        this.f1895a = zfVar;
        this.f1896b = i;
    }

    public final String a() {
        return this.f1895a.e;
    }

    public final String b() {
        return this.f1895a.f5745b.getString("ms");
    }

    public final PackageInfo c() {
        return this.f1895a.g;
    }

    public final boolean d() {
        return this.f1895a.i;
    }

    public final List<String> e() {
        return this.f1895a.f;
    }

    public final ApplicationInfo f() {
        return this.f1895a.d;
    }

    public final String g() {
        return this.f1895a.j;
    }

    public final int h() {
        return this.f1896b;
    }
}
