package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.github.ajalt.reprint.module.spass.BuildConfig;

/* access modifiers changed from: package-private */
public final class yh2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private ValueCallback<String> f5597b = new bi2(this);

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ qh2 f5598c;
    final /* synthetic */ WebView d;
    final /* synthetic */ boolean e;
    final /* synthetic */ wh2 f;

    yh2(wh2 wh2, qh2 qh2, WebView webView, boolean z) {
        this.f = wh2;
        this.f5598c = qh2;
        this.d = webView;
        this.e = z;
    }

    public final void run() {
        if (this.d.getSettings().getJavaScriptEnabled()) {
            try {
                this.d.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f5597b);
            } catch (Throwable unused) {
                this.f5597b.onReceiveValue(BuildConfig.FLAVOR);
            }
        }
    }
}
