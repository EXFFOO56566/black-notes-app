package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebView;
import com.google.android.gms.common.util.l;
import javax.annotation.concurrent.GuardedBy;

final class cv {
    @GuardedBy("InvokeJavascriptWorkaround.class")

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f2172a;

    private cv() {
    }

    @TargetApi(19)
    static void a(WebView webView, String str) {
        if (!l.f() || !a(webView)) {
            String valueOf = String.valueOf(str);
            webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    @TargetApi(19)
    private static boolean a(WebView webView) {
        boolean booleanValue;
        synchronized (cv.class) {
            if (f2172a == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    f2172a = true;
                } catch (IllegalStateException unused) {
                    f2172a = false;
                }
            }
            booleanValue = f2172a.booleanValue();
        }
        return booleanValue;
    }
}
