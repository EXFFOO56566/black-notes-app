package com.google.android.gms.internal.ads;

import android.content.Context;

final class ak1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f1777b;

    ak1(yh1 yh1, Context context) {
        this.f1777b = context;
    }

    public final void run() {
        try {
            yh1.z.a(this.f1777b);
        } catch (Exception e) {
            yh1.B.a(2019, -1, e);
        }
    }
}
