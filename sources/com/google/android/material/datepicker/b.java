package com.google.android.material.datepicker;

import a.g.k.h;
import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import b.c.b.b.w.c;
import b.c.b.b.z.g;
import b.c.b.b.z.k;

final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f5893a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f5894b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f5895c;
    private final ColorStateList d;
    private final int e;
    private final k f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, k kVar, Rect rect) {
        h.a(rect.left);
        h.a(rect.top);
        h.a(rect.right);
        h.a(rect.bottom);
        this.f5893a = rect;
        this.f5894b = colorStateList2;
        this.f5895c = colorStateList;
        this.d = colorStateList3;
        this.e = i;
        this.f = kVar;
    }

    static b a(Context context, int i) {
        h.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b.c.b.b.k.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(b.c.b.b.k.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(b.c.b.b.k.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(b.c.b.b.k.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(b.c.b.b.k.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a2 = c.a(context, obtainStyledAttributes, b.c.b.b.k.MaterialCalendarItem_itemFillColor);
        ColorStateList a3 = c.a(context, obtainStyledAttributes, b.c.b.b.k.MaterialCalendarItem_itemTextColor);
        ColorStateList a4 = c.a(context, obtainStyledAttributes, b.c.b.b.k.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(b.c.b.b.k.MaterialCalendarItem_itemStrokeWidth, 0);
        k a5 = k.a(context, obtainStyledAttributes.getResourceId(b.c.b.b.k.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(b.c.b.b.k.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, a5, rect);
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f5893a.bottom;
    }

    /* access modifiers changed from: package-private */
    public void a(TextView textView) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f);
        gVar2.setShapeAppearanceModel(this.f);
        gVar.a(this.f5895c);
        gVar.a((float) this.e, this.d);
        textView.setTextColor(this.f5894b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f5894b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f5893a;
        u.a(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f5893a.top;
    }
}
