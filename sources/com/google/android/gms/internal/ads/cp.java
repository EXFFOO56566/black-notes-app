package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class cp extends ep implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f2151c;

    public cp(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f2151c = new WeakReference<>(onGlobalLayoutListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ep
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ep
    public final void b(ViewTreeObserver viewTreeObserver) {
        q.e();
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f2151c.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            b();
        }
    }
}
