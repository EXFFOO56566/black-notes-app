package a.m;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f368a = true;

    static w a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new v(viewGroup) : u.a(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void a(ViewGroup viewGroup, boolean z) {
        if (f368a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f368a = false;
            }
        }
    }

    static void b(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            a(viewGroup, z);
        } else {
            y.a(viewGroup, z);
        }
    }
}
