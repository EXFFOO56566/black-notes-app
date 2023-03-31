package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import b.c.b.a.c.q.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

final class e71 implements y61<b71> {

    /* renamed from: a  reason: collision with root package name */
    private final ko1 f2377a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f2378b;

    public e71(ko1 ko1, Context context) {
        this.f2377a = ko1;
        this.f2378b = context;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String a(Context context) {
        try {
            PackageInfo b2 = c.a(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String a(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo a2 = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (a2 == null || (activityInfo = a2.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo b2 = c.a(context).b(activityInfo.packageName, 0);
            if (b2 != null) {
                int i = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y61
    public final lo1<b71> a() {
        return this.f2377a.a(new d71(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ b71 b() {
        boolean z;
        PackageManager packageManager = this.f2378b.getPackageManager();
        Locale locale = Locale.getDefault();
        boolean z2 = a(packageManager, "geo:0,0?q=donuts") != null;
        boolean z3 = a(packageManager, "http://www.google.com") != null;
        String country = locale.getCountry();
        boolean startsWith = Build.DEVICE.startsWith("generic");
        boolean a2 = h.a(this.f2378b);
        boolean b2 = h.b(this.f2378b);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = LocaleList.getDefault();
            for (int i = 0; i < localeList.size(); i++) {
                arrayList.add(localeList.get(i).getLanguage());
            }
        }
        String a3 = a(this.f2378b, packageManager);
        String a4 = a(this.f2378b);
        String str = Build.FINGERPRINT;
        Context context = this.f2378b;
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (!(queryIntentActivities == null || resolveActivity == null)) {
                int i2 = 0;
                while (true) {
                    if (i2 >= queryIntentActivities.size()) {
                        break;
                    } else if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                        z = resolveActivity.activityInfo.packageName.equals(d52.a(context));
                        break;
                    } else {
                        i2++;
                    }
                }
                return new b71(z2, z3, country, startsWith, a2, b2, language, arrayList, a3, a4, str, z, Build.MODEL, q.e().d());
            }
        }
        z = false;
        return new b71(z2, z3, country, startsWith, a2, b2, language, arrayList, a3, a4, str, z, Build.MODEL, q.e().d());
    }
}
