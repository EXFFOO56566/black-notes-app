package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.q;
import java.io.File;
import java.util.Collections;
import java.util.Map;

@TargetApi(11)
public class bu extends vs {
    public bu(ws wsVar, wj2 wj2, boolean z) {
        super(wsVar, wj2, z);
    }

    /* access modifiers changed from: protected */
    public final WebResourceResponse a(WebView webView, String str, Map<String, String> map) {
        if (!(webView instanceof ws)) {
            co.d("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        ws wsVar = (ws) webView;
        vi viVar = this.s;
        if (viVar != null) {
            viVar.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.a(str, map);
        }
        if (wsVar.P() != null) {
            wsVar.P().d();
        }
        String str2 = (String) on2.e().a(wsVar.f().b() ? zr2.E : wsVar.h() ? zr2.D : zr2.C);
        q.c();
        return gl.c(wsVar.getContext(), wsVar.b().f2633b, str2);
    }
}
