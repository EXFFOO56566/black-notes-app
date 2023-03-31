package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.r;

public final class f {
    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i) {
        try {
            r.a(context);
            r.a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
