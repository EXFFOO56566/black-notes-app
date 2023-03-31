package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;

@TargetApi(11)
public final class yt extends bu {
    public yt(ws wsVar, wj2 wj2, boolean z) {
        super(wsVar, wj2, z);
    }

    @Override // android.webkit.WebViewClient, com.google.android.gms.internal.ads.vs
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return a(webView, str, (Map<String, String>) null);
    }
}
