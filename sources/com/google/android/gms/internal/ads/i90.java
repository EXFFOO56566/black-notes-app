package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;

/* access modifiers changed from: package-private */
public final /* synthetic */ class i90 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final l90 f3046b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f3047c;

    i90(l90 l90, Object obj) {
        this.f3046b = l90;
        this.f3047c = obj;
    }

    public final void run() {
        try {
            this.f3046b.a(this.f3047c);
        } catch (Throwable th) {
            q.g().b(th, "EventEmitter.notify");
            wk.e("Event emitter exception.", th);
        }
    }
}
