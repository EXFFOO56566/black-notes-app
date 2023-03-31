package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.a;
import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dt implements ln1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2312a;

    /* renamed from: b  reason: collision with root package name */
    private final eq1 f2313b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f2314c;
    private final a d;
    private final String e;

    dt(Context context, eq1 eq1, fo foVar, a aVar, String str) {
        this.f2312a = context;
        this.f2313b = eq1;
        this.f2314c = foVar;
        this.d = aVar;
        this.e = str;
    }

    @Override // com.google.android.gms.internal.ads.ln1
    public final lo1 a(Object obj) {
        Context context = this.f2312a;
        eq1 eq1 = this.f2313b;
        fo foVar = this.f2314c;
        a aVar = this.d;
        String str = this.e;
        q.d();
        ws a2 = et.a(context, lu.f(), BuildConfig.FLAVOR, false, false, eq1, foVar, null, null, aVar, wj2.a(), null, false);
        so c2 = so.c(a2);
        a2.P().a(new ft(c2));
        a2.loadUrl(str);
        return c2;
    }
}
