package com.google.android.material.internal;

import a.g.l.g;
import a.g.l.u;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.c.b.b.k;

public class c extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    private int f5963b;

    /* renamed from: c  reason: collision with root package name */
    private int f5964c;
    private boolean d;

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        a(context, attributeSet);
    }

    @TargetApi(21)
    public c(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = false;
        a(context, attributeSet);
    }

    private static int a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k.FlowLayout, 0, 0);
        this.f5963b = obtainStyledAttributes.getDimensionPixelSize(k.FlowLayout_lineSpacing, 0);
        this.f5964c = obtainStyledAttributes.getDimensionPixelSize(k.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f5964c;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f5963b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (u.o(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i5 = g.b(marginLayoutParams);
                        i6 = g.a(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.d && measuredWidth > i7) {
                        i9 = this.f5963b + paddingTop;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        i11 = i7 - measuredWidth2;
                        measuredWidth2 = (i7 - i8) - i5;
                    }
                    childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f5964c;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || a()) {
                    i5 = paddingLeft;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f5963b + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f5964c;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i8 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f5964c = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f5963b = i;
    }

    public void setSingleLine(boolean z) {
        this.d = z;
    }
}
