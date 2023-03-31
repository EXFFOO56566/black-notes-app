package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;

public class c {
    public static boolean a() {
        return false;
    }

    public static boolean a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (b.c.b.a.c.q.c.a(context).a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
