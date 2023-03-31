package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zl implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final xl f5776b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5777c;
    private final int d;
    private final int e;

    zl(xl xlVar, int i, int i2, int i3) {
        this.f5776b = xlVar;
        this.f5777c = i;
        this.d = i2;
        this.e = i3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f5776b.a(this.f5777c, this.d, this.e, dialogInterface, i);
    }
}
