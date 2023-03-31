package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;
import b.c.b.b.k;
import b.c.b.b.w.b;
import b.c.b.b.w.c;

public class MaterialTextView extends z {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int a2;
        if (a(context)) {
            Resources.Theme theme = context.getTheme();
            if (!a(context, theme, attributeSet, i, i2) && (a2 = a(theme, attributeSet, i, i2)) != -1) {
                a(theme, a2);
            }
        }
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = c.a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static int a(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(k.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void a(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, k.MaterialTextAppearance);
        int a2 = a(getContext(), obtainStyledAttributes, k.MaterialTextAppearance_android_lineHeight, k.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a2 >= 0) {
            setLineHeight(a2);
        }
    }

    private static boolean a(Context context) {
        return b.a(context, b.c.b.b.b.textAppearanceLineHeightEnabled, true);
    }

    private static boolean a(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.MaterialTextView, i, i2);
        int a2 = a(context, obtainStyledAttributes, k.MaterialTextView_android_lineHeight, k.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        return a2 != -1;
    }

    @Override // androidx.appcompat.widget.z
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (a(context)) {
            a(context.getTheme(), i);
        }
    }
}
