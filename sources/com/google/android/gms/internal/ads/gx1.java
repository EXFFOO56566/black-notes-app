package com.google.android.gms.internal.ads;

public final class gx1 {
    public static boolean a() {
        try {
            Class.forName("android.app.Application", false, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
