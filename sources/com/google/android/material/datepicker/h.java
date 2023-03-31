package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.c;
import b.c.b.b.w.b;

public final class h<S> extends c {
    static boolean b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.a(context, b.c.b.b.b.materialCalendarStyle, g.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
