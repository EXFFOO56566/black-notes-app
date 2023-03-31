package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;

public final class d {
    public static boolean a(String str) {
        return a((String) on2.e().a(zr2.q2), str);
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                q.g().a(e, "NonagonUtil.isPatternMatched");
            }
        }
        return false;
    }
}
