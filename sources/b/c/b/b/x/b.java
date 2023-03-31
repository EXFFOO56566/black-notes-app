package b.c.b.b.x;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f1301a = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f1302b = {16842910, 16842919};

    /* renamed from: c  reason: collision with root package name */
    static final String f1303c = b.class.getSimpleName();

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 22 && i <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1302b, 0)) != 0) {
            Log.w(f1303c, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean a(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
