package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;

public final class d61 implements y61<e61> {

    /* renamed from: a  reason: collision with root package name */
    private final cj f2215a;

    /* renamed from: b  reason: collision with root package name */
    private final ko1 f2216b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2217c;

    public d61(cj cjVar, ko1 ko1, Context context) {
        this.f2215a = cjVar;
        this.f2216b = ko1;
        this.f2217c = context;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<e61> a() {
        return this.f2216b.a(new g61(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e61 b() {
        if (!this.f2215a.a(this.f2217c)) {
            return new e61(null, null, null, null, null);
        }
        String c2 = this.f2215a.c(this.f2217c);
        String str = c2 == null ? BuildConfig.FLAVOR : c2;
        String d = this.f2215a.d(this.f2217c);
        String str2 = d == null ? BuildConfig.FLAVOR : d;
        String e = this.f2215a.e(this.f2217c);
        String str3 = e == null ? BuildConfig.FLAVOR : e;
        String f = this.f2215a.f(this.f2217c);
        return new e61(str, str2, str3, f == null ? BuildConfig.FLAVOR : f, "TIME_OUT".equals(str2) ? (Long) on2.e().a(zr2.V) : null);
    }
}
