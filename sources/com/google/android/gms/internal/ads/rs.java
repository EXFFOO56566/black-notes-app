package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* access modifiers changed from: package-private */
public final class rs implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4540b;

    rs(JsPromptResult jsPromptResult) {
        this.f4540b = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4540b.cancel();
    }
}
