package com.google.android.gms.internal.ads;

public final class tf2 {
    public static boolean a(String str) {
        return "audio".equals(c(str));
    }

    public static boolean b(String str) {
        return "video".equals(c(str));
    }

    private static String c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid mime type: ".concat(valueOf) : new String("Invalid mime type: "));
    }
}
