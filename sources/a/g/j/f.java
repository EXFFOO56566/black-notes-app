package a.g.j;

import android.os.Build;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.Locale;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Locale f189a = new Locale(BuildConfig.FLAVOR, BuildConfig.FLAVOR);

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(f189a)) {
            return 0;
        }
        String b2 = b.b(locale);
        return b2 == null ? a(locale) : (b2.equalsIgnoreCase("Arab") || b2.equalsIgnoreCase("Hebr")) ? 1 : 0;
    }
}
