package com.google.android.gms.internal.ads;

import android.view.View;

final class zh2 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f5755b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ wh2 f5756c;

    zh2(wh2 wh2, View view) {
        this.f5756c = wh2;
        this.f5755b = view;
    }

    public final void run() {
        this.f5756c.a(this.f5755b);
    }
}
