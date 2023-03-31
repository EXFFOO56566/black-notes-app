package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.Map;

@TargetApi(21)
public class rl extends sl {
    @Override // com.google.android.gms.internal.ads.ll
    public final WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final vs a(ws wsVar, wj2 wj2, boolean z) {
        return new au(wsVar, wj2, z);
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final int c() {
        return 16974374;
    }

    @Override // com.google.android.gms.internal.ads.ll
    public final CookieManager c(Context context) {
        if (ll.e()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            co.b("Failed to obtain CookieManager.", th);
            q.g().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }
}
