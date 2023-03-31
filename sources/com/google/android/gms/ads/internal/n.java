package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;

/* access modifiers changed from: package-private */
public final class n implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ l f1407b;

    n(l lVar) {
        this.f1407b = lVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f1407b.i == null) {
            return false;
        }
        this.f1407b.i.a(motionEvent);
        return false;
    }
}
