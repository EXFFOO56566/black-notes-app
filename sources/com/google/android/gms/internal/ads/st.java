package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.internal.ads.eu;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.wt;

@TargetApi(17)
public final class st<WebViewT extends wt & eu & gu> {

    /* renamed from: a  reason: collision with root package name */
    private final xt f4700a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewT f4701b;

    private st(WebViewT webviewt, xt xtVar) {
        this.f4700a = xtVar;
        this.f4701b = webviewt;
    }

    public static st<ws> a(ws wsVar) {
        return new st<>(wsVar, new vt(wsVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str) {
        this.f4700a.a(Uri.parse(str));
    }

    @JavascriptInterface
    public final String getClickSignals(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Click string is empty, not proceeding.";
        } else {
            eq1 d = this.f4701b.d();
            if (d == null) {
                str2 = "Signal utils is empty, ignoring.";
            } else {
                wf1 a2 = d.a();
                if (a2 == null) {
                    str2 = "Signals object is empty, ignoring.";
                } else if (this.f4701b.getContext() != null) {
                    return a2.a(this.f4701b.getContext(), str, this.f4701b.getView(), this.f4701b.a());
                } else {
                    str2 = "Context is null, ignoring.";
                }
            }
        }
        wk.e(str2);
        return BuildConfig.FLAVOR;
    }

    @JavascriptInterface
    public final void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            co.d("URL is empty, ignoring message");
        } else {
            gl.h.post(new ut(this, str));
        }
    }
}
