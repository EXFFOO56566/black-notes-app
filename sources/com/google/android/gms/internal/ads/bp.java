package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final class bp extends ep implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<ViewTreeObserver.OnScrollChangedListener> f1984c;

    public bp(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f1984c = new WeakReference<>(onScrollChangedListener);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ep
    public final void a(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.ep
    public final void b(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f1984c.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            b();
        }
    }
}
