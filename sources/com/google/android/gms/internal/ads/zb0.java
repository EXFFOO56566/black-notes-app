package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;

public final class zb0 implements yi2 {

    /* renamed from: a  reason: collision with root package name */
    private tk1 f5729a;

    @Override // com.google.android.gms.internal.ads.yi2
    public final void a(Activity activity, WebView webView) {
        try {
            this.f5729a = new tk1(activity, webView);
        } catch (RuntimeException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
            sb.append(" Failed to initialize the internal ArWebView: ");
            sb.append(valueOf);
            co.b(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.yi2
    public final void a(WebView webView, String str, Bitmap bitmap) {
        if (this.f5729a != null) {
            tk1.a(webView, str, bitmap);
        }
    }

    @Override // com.google.android.gms.internal.ads.yi2
    public final void a(String str, String str2) {
        if (this.f5729a == null) {
            co.b("ArWebView is not initialized.");
        } else {
            tk1.getWebView().loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.yi2
    public final View getView() {
        return this.f5729a;
    }

    @Override // com.google.android.gms.internal.ads.yi2
    public final WebView getWebView() {
        if (this.f5729a == null) {
            return null;
        }
        return tk1.getWebView();
    }
}
