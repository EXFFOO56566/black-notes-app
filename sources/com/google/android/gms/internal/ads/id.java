package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

final class id implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ gd f3065b;

    id(gd gdVar) {
        this.f3065b = gdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3065b.a("Operation denied by user.");
    }
}
