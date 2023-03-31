package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.co;

/* access modifiers changed from: package-private */
public final class k extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ l f1403a;

    k(l lVar) {
        this.f1403a = lVar;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f1403a.h != null) {
            try {
                this.f1403a.h.a(0);
            } catch (RemoteException e) {
                co.d("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f1403a.c2())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (this.f1403a.h != null) {
                try {
                    this.f1403a.h.a(3);
                } catch (RemoteException e) {
                    co.d("#007 Could not call remote method.", e);
                }
            }
            this.f1403a.b(0);
            return true;
        } else if (str.startsWith("gmsg://scriptLoadFailed")) {
            if (this.f1403a.h != null) {
                try {
                    this.f1403a.h.a(0);
                } catch (RemoteException e2) {
                    co.d("#007 Could not call remote method.", e2);
                }
            }
            this.f1403a.b(0);
            return true;
        } else if (str.startsWith("gmsg://adResized")) {
            if (this.f1403a.h != null) {
                try {
                    this.f1403a.h.s();
                } catch (RemoteException e3) {
                    co.d("#007 Could not call remote method.", e3);
                }
            }
            this.f1403a.b(this.f1403a.A(str));
            return true;
        } else if (str.startsWith("gmsg://")) {
            return true;
        } else {
            if (this.f1403a.h != null) {
                try {
                    this.f1403a.h.G();
                } catch (RemoteException e4) {
                    co.d("#007 Could not call remote method.", e4);
                }
            }
            this.f1403a.C(this.f1403a.B(str));
            return true;
        }
    }
}
