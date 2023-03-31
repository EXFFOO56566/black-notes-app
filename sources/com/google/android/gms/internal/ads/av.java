package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.q;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class av extends zu implements fv {

    /* renamed from: b  reason: collision with root package name */
    private final yu f1818b;
    @GuardedBy("this")

    /* renamed from: c  reason: collision with root package name */
    private boolean f1819c;
    @GuardedBy("this")
    private boolean d;

    public av(Context context, yu yuVar) {
        super(context);
        q.g().f();
        this.f1818b = yuVar;
        super.setWebViewClient(yuVar);
    }

    private final synchronized void R() {
        if (!this.d) {
            this.d = true;
            q.g().g();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void O() {
        super.destroy();
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final synchronized void a(bv bvVar) {
        wk.e("Blank page loaded, 1...");
        m();
    }

    /* access modifiers changed from: protected */
    @GuardedBy("this")
    public void d(boolean z) {
    }

    public synchronized void destroy() {
        if (!this.f1819c) {
            this.f1819c = true;
            this.f1818b.a(this);
            d(false);
            wk.e("Initiating WebView self destruct sequence in 3...");
            wk.e("Loading blank page in WebView, 2...");
            try {
                super.loadUrl("about:blank");
            } catch (UnsatisfiedLinkError e) {
                q.g().a(e, "AdWebViewImpl.loadUrlUnsafe");
                co.d("#007 Could not call remote method.", e);
            }
        }
    }

    public final synchronized boolean e() {
        return this.f1819c;
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (e()) {
            co.d("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        try {
            synchronized (this) {
                if (!e()) {
                    d(true);
                }
                R();
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized void loadData(String str, String str2, String str3) {
        if (!e()) {
            super.loadData(str, str2, str3);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!e()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zu
    public synchronized void loadUrl(String str) {
        if (!e()) {
            super.loadUrl(str);
        } else {
            co.d("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* access modifiers changed from: protected */
    public synchronized void m() {
        wk.e("Destroying WebView!");
        R();
        jo.e.execute(new dv(this));
    }

    /* access modifiers changed from: protected */
    @TargetApi(21)
    public void onDraw(Canvas canvas) {
        if (!e()) {
            super.onDraw(canvas);
        }
    }

    public void onPause() {
        if (!e()) {
            super.onPause();
        }
    }

    public void onResume() {
        if (!e()) {
            super.onResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !e() && super.onTouchEvent(motionEvent);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
    }

    public void stopLoading() {
        if (!e()) {
            super.stopLoading();
        }
    }
}
