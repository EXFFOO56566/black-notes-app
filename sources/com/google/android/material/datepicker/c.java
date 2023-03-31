package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import b.c.b.b.k;
import b.c.b.b.w.b;

/* access modifiers changed from: package-private */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f5896a;

    /* renamed from: b  reason: collision with root package name */
    final b f5897b;

    /* renamed from: c  reason: collision with root package name */
    final b f5898c;
    final b d;
    final b e;
    final b f;
    final b g;
    final Paint h;

    c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.a(context, b.c.b.b.b.materialCalendarStyle, g.class.getCanonicalName()), k.MaterialCalendar);
        this.f5896a = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_dayStyle, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_dayInvalidStyle, 0));
        this.f5897b = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_daySelectedStyle, 0));
        this.f5898c = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a2 = b.c.b.b.w.c.a(context, obtainStyledAttributes, k.MaterialCalendar_rangeFillColor);
        this.d = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_yearStyle, 0));
        this.e = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_yearSelectedStyle, 0));
        this.f = b.a(context, obtainStyledAttributes.getResourceId(k.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
