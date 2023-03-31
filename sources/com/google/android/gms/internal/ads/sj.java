package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;

public final class sj {
    private static Uri a(String str, String str2, String str3) {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        if (indexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = indexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    public static String a(Uri uri, Context context) {
        if (!q.A().a(context)) {
            return uri.toString();
        }
        String e = q.A().e(context);
        if (e == null) {
            return uri.toString();
        }
        if (((Boolean) on2.e().a(zr2.T)).booleanValue()) {
            String str = (String) on2.e().a(zr2.U);
            String uri2 = uri.toString();
            if (uri2.contains(str)) {
                q.A().d(context, e);
                return uri2.replace(str, e);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            uri = a(uri.toString(), "fbs_aeid", e);
            q.A().d(context, e);
        }
        return uri.toString();
    }

    public static String a(String str, Context context, boolean z) {
        String e;
        if ((((Boolean) on2.e().a(zr2.b0)).booleanValue() && !z) || !q.A().a(context) || TextUtils.isEmpty(str) || (e = q.A().e(context)) == null) {
            return str;
        }
        String c2 = q.A().c(context);
        String d = q.A().d(context);
        if (q.c().a(str) || q.c().b(str)) {
            if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(c2)) {
                str = a(str, "gmp_app_id", c2).toString();
            }
            if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(d)) {
                str = a(str, "fbs_aiid", d).toString();
            }
        }
        if (((Boolean) on2.e().a(zr2.T)).booleanValue()) {
            String str2 = (String) on2.e().a(zr2.U);
            if (!str.contains(str2)) {
                return str;
            }
            if (q.c().a(str)) {
                q.A().d(context, e);
                return str.replace(str2, e);
            } else if (!q.c().b(str)) {
                return str;
            } else {
                q.A().e(context, e);
                return str.replace(str2, e);
            }
        } else if (str.contains("fbs_aeid")) {
            return str;
        } else {
            if (q.c().a(str)) {
                q.A().d(context, e);
                return a(str, "fbs_aeid", e).toString();
            } else if (!q.c().b(str)) {
                return str;
            } else {
                q.A().e(context, e);
                return a(str, "fbs_aeid", e).toString();
            }
        }
    }
}
