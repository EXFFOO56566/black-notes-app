package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class yu extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5652b = {"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f5653c = {"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};

    /* renamed from: a  reason: collision with root package name */
    private fv f5654a;

    public void a(bv bvVar) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(fv fvVar) {
        this.f5654a = fvVar;
    }

    public void b(bv bvVar) {
        throw null;
    }

    public boolean c(bv bvVar) {
        throw null;
    }

    public WebResourceResponse d(bv bvVar) {
        return null;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (str != null) {
            String valueOf = String.valueOf(str);
            wk.e(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
            b(new bv(str));
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (str != null) {
            bv bvVar = new bv(str);
            fv fvVar = this.f5654a;
            if (fvVar != null) {
                fvVar.a(bvVar);
            } else {
                a(bvVar);
            }
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        if (i >= 0 || (-i) - 1 >= f5652b.length) {
            String.valueOf(i);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            if (primaryError < 0 || primaryError >= f5653c.length) {
                String.valueOf(primaryError);
            }
            sslError.getUrl();
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return d(new bv(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return d(new bv(str));
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return false;
        }
        return c(new bv(webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null) {
            return false;
        }
        return c(new bv(str));
    }
}
