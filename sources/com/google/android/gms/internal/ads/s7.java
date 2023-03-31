package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final String f4606b;

    s7(String str) {
        this.f4606b = str;
    }

    public final void run() {
        q.g().c().b(this.f4606b.substring(1));
    }
}
