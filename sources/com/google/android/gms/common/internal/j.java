package com.google.android.gms.common.internal;

public final class j {
    public j(String str) {
        this(str, null);
    }

    public j(String str, String str2) {
        r.a((Object) str, (Object) "log tag cannot be null");
        r.a(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        if (str2 == null || str2.length() <= 0) {
        }
    }
}
