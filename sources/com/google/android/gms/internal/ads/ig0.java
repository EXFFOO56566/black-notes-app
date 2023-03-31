package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ig0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final gg0 f3079b;

    /* renamed from: c  reason: collision with root package name */
    private final ViewGroup f3080c;

    ig0(gg0 gg0, ViewGroup viewGroup) {
        this.f3079b = gg0;
        this.f3080c = viewGroup;
    }

    public final void run() {
        this.f3079b.b(this.f3080c);
    }
}
