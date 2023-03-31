package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.q;
import java.util.ArrayList;
import java.util.List;

public final class k5 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3322a;

    /* renamed from: b  reason: collision with root package name */
    private final eq1 f3323b;

    /* renamed from: c  reason: collision with root package name */
    private final View f3324c;

    public k5(Context context, eq1 eq1, View view) {
        this.f3322a = context;
        this.f3323b = eq1;
        this.f3324c = view;
    }

    private static Intent a(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    private static Intent a(Uri uri) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    private final ResolveInfo a(Intent intent) {
        return a(intent, new ArrayList<>());
    }

    private final ResolveInfo a(Intent intent, ArrayList<ResolveInfo> arrayList) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = this.f3322a.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (queryIntentActivities != null && resolveActivity != null) {
                int i = 0;
                while (true) {
                    if (i >= queryIntentActivities.size()) {
                        break;
                    }
                    ResolveInfo resolveInfo2 = queryIntentActivities.get(i);
                    if (resolveActivity != null && resolveActivity.activityInfo.name.equals(resolveInfo2.activityInfo.name)) {
                        resolveInfo = resolveActivity;
                        break;
                    }
                    i++;
                }
            }
            arrayList.addAll(queryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            q.g().a(th, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k5.a(java.util.Map):android.content.Intent");
    }
}
