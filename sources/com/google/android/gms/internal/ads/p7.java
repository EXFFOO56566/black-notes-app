package com.google.android.gms.internal.ads;

import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p7 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final q7 f4118b;

    /* renamed from: c  reason: collision with root package name */
    private final d5 f4119c;
    private final Map d;

    p7(q7 q7Var, d5 d5Var, Map map) {
        this.f4118b = q7Var;
        this.f4119c = d5Var;
        this.d = map;
    }

    public final void run() {
        this.f4118b.a(this.f4119c, this.d);
    }
}
