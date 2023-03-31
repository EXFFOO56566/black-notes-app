package com.google.android.gms.internal.ads;

import android.webkit.JavascriptInterface;

final class k7 {

    /* renamed from: a  reason: collision with root package name */
    private final n7 f3333a;

    private k7(n7 n7Var) {
        this.f3333a = n7Var;
    }

    @JavascriptInterface
    public final void notify(String str) {
        this.f3333a.b(str);
    }
}
