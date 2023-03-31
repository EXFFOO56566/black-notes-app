package a.g.j;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f170a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f171b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f170a = cls.getMethod("getScript", String.class);
                    f171b = cls.getMethod("addLikelySubtags", String.class);
                }
            } catch (Exception e) {
                f170a = null;
                f171b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f171b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    private static String a(String str) {
        try {
            if (f170a != null) {
                return (String) f170a.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return null;
    }

    private static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f171b != null) {
                return (String) f171b.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            Log.w("ICUCompat", e);
        }
        return locale2;
    }

    public static String b(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f171b.invoke(null, locale)).getScript();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            }
        } else {
            String a2 = a(locale);
            if (a2 != null) {
                return a(a2);
            }
            return null;
        }
    }
}
