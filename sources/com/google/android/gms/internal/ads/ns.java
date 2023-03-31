package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* access modifiers changed from: package-private */
public final class ns implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f3881b;

    ns(JsResult jsResult) {
        this.f3881b = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f3881b.cancel();
    }
}
