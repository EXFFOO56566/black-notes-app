package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cm implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final xl f2137b;

    /* renamed from: c  reason: collision with root package name */
    private final String f2138c;

    cm(xl xlVar, String str) {
        this.f2137b = xlVar;
        this.f2138c = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f2137b.a(this.f2138c, dialogInterface, i);
    }
}
