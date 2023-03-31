package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final /* synthetic */ class fq2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final cq2 f2643b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f2644c;

    fq2(cq2 cq2, Context context) {
        this.f2643b = cq2;
        this.f2644c = context;
    }

    public final void run() {
        this.f2643b.a(this.f2644c);
    }
}
