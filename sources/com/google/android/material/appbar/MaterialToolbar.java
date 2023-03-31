package com.google.android.material.appbar;

import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import b.c.b.b.b;
import b.c.b.b.j;
import b.c.b.b.z.h;
import com.google.android.material.internal.g;

public class MaterialToolbar extends Toolbar {
    private static final int Q = j.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(g.b(context, attributeSet, i, Q), attributeSet, i);
        a(getContext());
    }

    private void a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            b.c.b.b.z.g gVar = new b.c.b.b.z.g();
            gVar.a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.a(context);
            gVar.a(u.k(this));
            u.a(this, gVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    public void setElevation(float f) {
        super.setElevation(f);
        h.a(this, f);
    }
}
