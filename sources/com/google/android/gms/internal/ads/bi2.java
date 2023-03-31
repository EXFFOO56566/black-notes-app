package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* access modifiers changed from: package-private */
public final class bi2 implements ValueCallback<String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ yh2 f1956a;

    bi2(yh2 yh2) {
        this.f1956a = yh2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        yh2 yh2 = this.f1956a;
        yh2.f.a(yh2.f5598c, yh2.d, str, yh2.e);
    }
}
