package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* access modifiers changed from: package-private */
public final class ps implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsResult f4224b;

    ps(JsResult jsResult) {
        this.f4224b = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4224b.confirm();
    }
}
