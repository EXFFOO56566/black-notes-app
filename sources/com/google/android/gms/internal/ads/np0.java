package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.c.b.a.c.q.c;

public final class np0 {
    public static PackageInfo a(Context context, ApplicationInfo applicationInfo) {
        try {
            return c.a(context).b(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
