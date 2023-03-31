package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.q;
import java.util.Map;

public final class py implements ly {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4249a;

    public py(Context context) {
        this.f4249a = context;
    }

    @Override // com.google.android.gms.internal.ads.ly
    public final void a(Map<String, String> map) {
        CookieManager c2;
        String str = map.get("cookie");
        if (!TextUtils.isEmpty(str) && (c2 = q.e().c(this.f4249a)) != null) {
            c2.setCookie("googleads.g.doubleclick.net", str);
        }
    }
}
