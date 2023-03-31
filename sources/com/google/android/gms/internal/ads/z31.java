package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;

public final class z31 implements y61<e41> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5692a;

    /* renamed from: b  reason: collision with root package name */
    private final ko1 f5693b;

    z31(Context context, ko1 ko1) {
        this.f5692a = context;
        this.f5693b = ko1;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<e41> a() {
        return this.f5693b.a(new c41(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ e41 b() {
        q.c();
        String l = gl.l(this.f5692a);
        boolean booleanValue = ((Boolean) on2.e().a(zr2.U2)).booleanValue();
        String str = BuildConfig.FLAVOR;
        if (booleanValue) {
            str = this.f5692a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str);
        }
        q.c();
        return new e41(l, str, gl.m(this.f5692a));
    }
}
