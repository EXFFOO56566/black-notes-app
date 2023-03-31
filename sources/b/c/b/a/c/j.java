package b.c.b.a.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import b.c.b.a.c.q.c;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.p;
import java.util.concurrent.atomic.AtomicBoolean;

public class j {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static final int f1165a = 12451000;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1166b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1167c = false;
    static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    @Deprecated
    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int a(Context context, int i) {
        try {
            context.getResources().getString(l.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !e.get()) {
            int b2 = o0.b(context);
            if (b2 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (b2 != f1165a) {
                int i2 = f1165a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(i2);
                sb.append(" but found ");
                sb.append(b2);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return a(context, !h.d(context) && !h.f(context), i);
    }

    private static int a(Context context, boolean z, int i) {
        String str;
        r.a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Google Play Store is missing.";
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            k.a(context);
            if (!k.a(packageInfo2, true)) {
                str = "Google Play services signature invalid.";
            } else if (z && (!k.a(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                str = "Google Play Store signature invalid.";
            } else if (p.a(packageInfo2.versionCode) < p.a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append("Google Play services out of date.  Requires ");
                sb.append(i);
                sb.append(" but found ");
                sb.append(i2);
                Log.w("GooglePlayServicesUtil", sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                        return 1;
                    }
                }
                return !applicationInfo.enabled ? 3 : 0;
            }
            Log.w("GooglePlayServicesUtil", str);
            return 9;
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static String a(int i) {
        return b.a(i);
    }

    @TargetApi(21)
    static boolean a(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (l.h()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            return equals ? applicationInfo.enabled : applicationInfo.enabled && !e(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Context b(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static boolean b(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean b(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return a(context, "com.google.android.gms");
        }
        return false;
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        if (!f1167c) {
            try {
                PackageInfo b2 = c.a(context).b("com.google.android.gms", 64);
                k.a(context);
                if (b2 == null || k.a(b2, false) || !k.a(b2, true)) {
                    f1166b = false;
                } else {
                    f1166b = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
            } catch (Throwable th) {
                f1167c = true;
                throw th;
            }
            f1167c = true;
        }
        return f1166b || !h.a();
    }

    @TargetApi(18)
    public static boolean e(Context context) {
        Bundle applicationRestrictions;
        return l.e() && (applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }
}
