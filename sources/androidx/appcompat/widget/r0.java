package androidx.appcompat.widget;

import a.g.e.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* access modifiers changed from: package-private */
public class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f690a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final int[] f691b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    static final int[] f692c = {16842908};
    static final int[] d = {16842919};
    static final int[] e = {16842912};
    static final int[] f = new int[0];
    private static final int[] g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList c2 = c(context, i);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(f691b, c2.getDefaultColor());
        }
        TypedValue a2 = a();
        context.getTheme().resolveAttribute(16842803, a2, true);
        return a(context, i, a2.getFloat());
    }

    static int a(Context context, int i, float f2) {
        int b2 = b(context, i);
        return a.c(b2, Math.round(((float) Color.alpha(b2)) * f2));
    }

    private static TypedValue a() {
        TypedValue typedValue = f690a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f690a.set(typedValue2);
        return typedValue2;
    }

    public static int b(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 a2 = w0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0, 0);
        } finally {
            a2.a();
        }
    }

    public static ColorStateList c(Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        w0 a2 = w0.a(context, (AttributeSet) null, iArr);
        try {
            return a2.a(0);
        } finally {
            a2.a();
        }
    }
}
