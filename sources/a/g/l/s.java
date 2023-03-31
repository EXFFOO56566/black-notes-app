package a.g.l;

import android.view.View;
import android.view.ViewTreeObserver;

public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f233b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f234c;
    private final Runnable d;

    private s(View view, Runnable runnable) {
        this.f233b = view;
        this.f234c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static s a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            s sVar = new s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return sVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public void a() {
        (this.f234c.isAlive() ? this.f234c : this.f233b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f233b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        a();
        this.d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f234c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
