package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

public final class b50 implements r42<z40> {

    /* renamed from: a  reason: collision with root package name */
    private final e52<sh1> f1862a;

    /* renamed from: b  reason: collision with root package name */
    private final e52<fo> f1863b;

    /* renamed from: c  reason: collision with root package name */
    private final e52<ApplicationInfo> f1864c;
    private final e52<String> d;
    private final e52<List<String>> e;
    private final e52<PackageInfo> f;
    private final e52<lo1<String>> g;
    private final e52<yk> h;
    private final e52<String> i;
    private final e52<x61<Bundle>> j;

    private b50(e52<sh1> e52, e52<fo> e522, e52<ApplicationInfo> e523, e52<String> e524, e52<List<String>> e525, e52<PackageInfo> e526, e52<lo1<String>> e527, e52<yk> e528, e52<String> e529, e52<x61<Bundle>> e5210) {
        this.f1862a = e52;
        this.f1863b = e522;
        this.f1864c = e523;
        this.d = e524;
        this.e = e525;
        this.f = e526;
        this.g = e527;
        this.h = e528;
        this.i = e529;
        this.j = e5210;
    }

    public static b50 a(e52<sh1> e52, e52<fo> e522, e52<ApplicationInfo> e523, e52<String> e524, e52<List<String>> e525, e52<PackageInfo> e526, e52<lo1<String>> e527, e52<yk> e528, e52<String> e529, e52<x61<Bundle>> e5210) {
        return new b50(e52, e522, e523, e524, e525, e526, e527, e528, e529, e5210);
    }

    @Override // com.google.android.gms.internal.ads.e52
    public final /* synthetic */ Object get() {
        return new z40(this.f1862a.get(), this.f1863b.get(), this.f1864c.get(), this.d.get(), this.e.get(), this.f.get(), t42.b(this.g), this.h.get(), this.i.get(), this.j.get());
    }
}
