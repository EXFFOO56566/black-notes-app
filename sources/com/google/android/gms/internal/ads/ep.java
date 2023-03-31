package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public abstract class ep {

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<View> f2463b;

    public ep(View view) {
        this.f2463b = new WeakReference<>(view);
    }

    private final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = this.f2463b.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void a() {
        ViewTreeObserver c2 = c();
        if (c2 != null) {
            a(c2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(ViewTreeObserver viewTreeObserver);

    public final void b() {
        ViewTreeObserver c2 = c();
        if (c2 != null) {
            b(c2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(ViewTreeObserver viewTreeObserver);
}
