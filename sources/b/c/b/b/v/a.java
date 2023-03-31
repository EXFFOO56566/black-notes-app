package b.c.b.b.v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import b.c.b.b.b;
import b.c.b.b.j;
import b.c.b.b.k;
import com.google.android.material.internal.g;

public class a extends s {
    private static final int g = j.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList e;
    private boolean f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.radioButtonStyle);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(g.b(context, attributeSet, i, g), attributeSet, i);
        TypedArray c2 = g.c(getContext(), attributeSet, k.MaterialRadioButton, i, g, new int[0]);
        this.f = c2.getBoolean(k.MaterialRadioButton_useMaterialThemeColors, false);
        c2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int a2 = b.c.b.b.q.a.a(this, b.colorControlActivated);
            int a3 = b.c.b.b.q.a.a(this, b.colorOnSurface);
            int a4 = b.c.b.b.q.a.a(this, b.colorSurface);
            int[] iArr = new int[h.length];
            iArr[0] = b.c.b.b.q.a.a(a4, a2, 1.0f);
            iArr[1] = b.c.b.b.q.a.a(a4, a3, 0.54f);
            iArr[2] = b.c.b.b.q.a.a(a4, a3, 0.38f);
            iArr[3] = b.c.b.b.q.a.a(a4, a3, 0.38f);
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
