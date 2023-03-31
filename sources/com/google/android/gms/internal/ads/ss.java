package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* access modifiers changed from: package-private */
public final class ss implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4697b;

    ss(JsPromptResult jsPromptResult) {
        this.f4697b = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f4697b.cancel();
    }
}
