package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.concurrent.Callable;

final /* synthetic */ class mp0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3743a;

    mp0(Context context) {
        this.f3743a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CookieManager c2 = q.e().c(this.f3743a);
        return c2 != null ? c2.getCookie("googleads.g.doubleclick.net") : BuildConfig.FLAVOR;
    }
}
