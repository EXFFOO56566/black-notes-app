package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import b.c.b.a.c.q.c;
import javax.annotation.concurrent.GuardedBy;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    private static Object f1640a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1641b;

    /* renamed from: c  reason: collision with root package name */
    private static String f1642c;
    private static int d;

    public static String a(Context context) {
        c(context);
        return f1642c;
    }

    public static int b(Context context) {
        c(context);
        return d;
    }

    private static void c(Context context) {
        synchronized (f1640a) {
            if (!f1641b) {
                f1641b = true;
                try {
                    Bundle bundle = c.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f1642c = bundle.getString("com.google.app.id");
                        d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
