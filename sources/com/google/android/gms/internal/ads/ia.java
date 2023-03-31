package com.google.android.gms.internal.ads;

import android.content.Context;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ia implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final Context f3049b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3050c;

    ia(ja jaVar, Context context, String str) {
        this.f3049b = context;
        this.f3050c = str;
    }

    public final void run() {
        ja.b(this.f3049b, this.f3050c);
    }
}
