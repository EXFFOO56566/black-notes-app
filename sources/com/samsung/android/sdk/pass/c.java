package com.samsung.android.sdk.pass;

import android.content.DialogInterface;
import com.samsung.android.sdk.pass.SpassFingerprint;

final class c implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ SpassFingerprint.c f6063a;

    c(SpassFingerprint.c cVar) {
        this.f6063a = cVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f6063a.a();
    }
}
