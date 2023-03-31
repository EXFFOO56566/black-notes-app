package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f1657a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f1658b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f1659c;
    private static Boolean d;

    public static boolean a() {
        return "user".equals(Build.TYPE);
    }

    public static boolean a(Context context) {
        if (f1659c == null) {
            PackageManager packageManager = context.getPackageManager();
            f1659c = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services"));
        }
        return f1659c.booleanValue();
    }

    @TargetApi(21)
    public static boolean b(Context context) {
        return e(context);
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        if (f1657a == null) {
            f1657a = Boolean.valueOf(l.g() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f1657a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (!c(context)) {
            return false;
        }
        if (l.j()) {
            return e(context) && !l.k();
        }
        return true;
    }

    @TargetApi(21)
    private static boolean e(Context context) {
        if (f1658b == null) {
            f1658b = Boolean.valueOf(l.h() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f1658b.booleanValue();
    }

    public static boolean f(Context context) {
        if (d == null) {
            d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return d.booleanValue();
    }
}
