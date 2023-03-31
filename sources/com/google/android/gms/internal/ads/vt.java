package com.google.android.gms.internal.ads;

import android.net.Uri;

/* access modifiers changed from: package-private */
public final /* synthetic */ class vt implements xt {

    /* renamed from: a  reason: collision with root package name */
    private final ws f5156a;

    vt(ws wsVar) {
        this.f5156a = wsVar;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void a(Uri uri) {
        ju P = this.f5156a.P();
        if (P == null) {
            co.b("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            P.a(uri);
        }
    }
}
