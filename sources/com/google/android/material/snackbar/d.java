package com.google.android.material.snackbar;

import a.g.l.u;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.c.b.b.k;
import com.google.android.material.internal.g;

public class d extends FrameLayout {
    private static final View.OnTouchListener g = new a();

    /* renamed from: b  reason: collision with root package name */
    private c f5982b;

    /* renamed from: c  reason: collision with root package name */
    private b f5983c;
    private int d;
    private final float e;
    private final float f;

    static class a implements View.OnTouchListener {
        a() {
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    protected d(Context context) {
        this(context, null);
    }

    protected d(Context context, AttributeSet attributeSet) {
        super(g.b(context, attributeSet, 0, 0), attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        if (obtainStyledAttributes.hasValue(k.SnackbarLayout_elevation)) {
            u.a(this, (float) obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_elevation, 0));
        }
        this.d = obtainStyledAttributes.getInt(k.SnackbarLayout_animationMode, 0);
        this.e = obtainStyledAttributes.getFloat(k.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        this.f = obtainStyledAttributes.getFloat(k.SnackbarLayout_actionTextColorAlpha, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(g);
        setFocusable(true);
    }

    /* access modifiers changed from: package-private */
    public float getActionTextColorAlpha() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public int getAnimationMode() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    public float getBackgroundOverlayColorAlpha() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f5983c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        u.H(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f5983c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c cVar = this.f5982b;
        if (cVar != null) {
            cVar.a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationMode(int i) {
        this.d = i;
    }

    /* access modifiers changed from: package-private */
    public void setOnAttachStateChangeListener(b bVar) {
        this.f5983c = bVar;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : g);
        super.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: package-private */
    public void setOnLayoutChangeListener(c cVar) {
        this.f5982b = cVar;
    }
}
