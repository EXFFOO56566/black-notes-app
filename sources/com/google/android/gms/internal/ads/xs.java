package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class xs implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final String f5488b;

    xs(String str) {
        this.f5488b = str;
    }

    public final void run() {
        q.g().c().b(this.f5488b.substring(1));
    }
}
