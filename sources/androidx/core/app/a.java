package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;

public class a extends a.g.d.a {

    /* renamed from: c  reason: collision with root package name */
    private static AbstractC0042a f762c;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    public interface AbstractC0042a {
        boolean a(Activity activity, int i, int i2, Intent intent);
    }

    public static AbstractC0042a a() {
        return f762c;
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28 || !b.a(activity)) {
            activity.recreate();
        }
    }
}
