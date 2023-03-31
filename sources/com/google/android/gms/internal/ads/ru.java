package com.google.android.gms.internal.ads;

import android.view.View;

/* access modifiers changed from: package-private */
public final class ru implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ View f4546b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ vi f4547c;
    private final /* synthetic */ int d;
    private final /* synthetic */ pu e;

    ru(pu puVar, View view, vi viVar, int i) {
        this.e = puVar;
        this.f4546b = view;
        this.f4547c = viVar;
        this.d = i;
    }

    public final void run() {
        this.e.a((pu) this.f4546b, (View) this.f4547c, (vi) (this.d - 1));
    }
}
