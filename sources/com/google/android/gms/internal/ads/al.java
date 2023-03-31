package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final /* synthetic */ class al implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final bl f1780b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f1781c;
    private final String d;

    al(bl blVar, Context context, String str) {
        this.f1780b = blVar;
        this.f1781c = context;
        this.d = str;
    }

    public final void run() {
        this.f1780b.a(this.f1781c, this.d);
    }
}
