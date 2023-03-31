package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* access modifiers changed from: package-private */
public final class us implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ JsPromptResult f4995b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ EditText f4996c;

    us(JsPromptResult jsPromptResult, EditText editText) {
        this.f4995b = jsPromptResult;
        this.f4996c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4995b.confirm(this.f4996c.getText().toString());
    }
}
