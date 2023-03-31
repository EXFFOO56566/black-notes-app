package b.c.b.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import b.c.b.b.b;
import b.c.b.b.j;
import b.c.b.b.k;

public class a extends g {
    private static final int g = j.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.checkboxStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(com.google.android.material.internal.g.b(context, attributeSet, i, g), attributeSet, i);
        Context context2 = getContext();
        TypedArray c2 = com.google.android.material.internal.g.c(context2, attributeSet, k.MaterialCheckBox, i, g, new int[0]);
        if (c2.hasValue(k.MaterialCheckBox_buttonTint)) {
            c.a(this, b.c.b.b.w.c.a(context2, c2, k.MaterialCheckBox_buttonTint));
        }
        this.f = c2.getBoolean(k.MaterialCheckBox_useMaterialThemeColors, false);
        c2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int[] iArr = new int[h.length];
            int a2 = b.c.b.b.q.a.a(this, b.colorControlActivated);
            int a3 = b.c.b.b.q.a.a(this, b.colorSurface);
            int a4 = b.c.b.b.q.a.a(this, b.colorOnSurface);
            iArr[0] = b.c.b.b.q.a.a(a3, a2, 1.0f);
            iArr[1] = b.c.b.b.q.a.a(a3, a4, 0.54f);
            iArr[2] = b.c.b.b.q.a.a(a3, a4, 0.38f);
            iArr[3] = b.c.b.b.q.a.a(a3, a4, 0.38f);
            this.e = new ColorStateList(h, iArr);
        }
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        c.a(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
