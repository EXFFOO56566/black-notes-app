package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.ads.internal.q;

public final class pn {

    /* renamed from: a  reason: collision with root package name */
    private final View f4206a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f4207b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4208c;
    private boolean d;
    private boolean e;
    private ViewTreeObserver.OnGlobalLayoutListener f;

    public pn(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f4207b = activity;
        this.f4206a = view;
        this.f = onGlobalLayoutListener;
    }

    private static ViewTreeObserver b(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void e() {
        ViewTreeObserver b2;
        if (!this.f4208c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (onGlobalLayoutListener != null) {
                Activity activity = this.f4207b;
                if (!(activity == null || (b2 = b(activity)) == null)) {
                    b2.addOnGlobalLayoutListener(onGlobalLayoutListener);
                }
                q.z();
                zo.a(this.f4206a, this.f);
            }
            this.f4208c = true;
        }
    }

    private final void f() {
        ViewTreeObserver b2;
        Activity activity = this.f4207b;
        if (activity != null && this.f4208c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f;
            if (!(onGlobalLayoutListener == null || (b2 = b(activity)) == null)) {
                q.e();
                b2.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f4208c = false;
        }
    }

    public final void a() {
        this.d = true;
        if (this.e) {
            e();
        }
    }

    public final void a(Activity activity) {
        this.f4207b = activity;
    }

    public final void b() {
        this.d = false;
        f();
    }

    public final void c() {
        this.e = true;
        if (this.d) {
            e();
        }
    }

    public final void d() {
        this.e = false;
        f();
    }
}
