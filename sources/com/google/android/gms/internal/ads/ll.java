package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.io.InputStream;
import java.util.Map;

@TargetApi(16)
public class ll {
    private ll() {
    }

    public static ll a(int i) {
        return i >= 28 ? new wl() : i >= 26 ? new tl() : i >= 24 ? new ul() : i >= 21 ? new rl() : i >= 19 ? new sl() : i >= 18 ? new pl() : i >= 17 ? new ql() : new ll();
    }

    public static boolean a(ws wsVar) {
        if (wsVar == null) {
            return false;
        }
        wsVar.onPause();
        return true;
    }

    public static boolean b(ws wsVar) {
        if (wsVar == null) {
            return false;
        }
        wsVar.onResume();
        return true;
    }

    public static boolean e() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public int a() {
        return 5;
    }

    public int a(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public Drawable a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public WebResourceResponse a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public vs a(ws wsVar, wj2 wj2, boolean z) {
        return new yt(wsVar, wj2, z);
    }

    public wl2 a(Context context, TelephonyManager telephonyManager) {
        return wl2.ENUM_UNKNOWN;
    }

    public String a(Context context) {
        return BuildConfig.FLAVOR;
    }

    public void a(Activity activity) {
    }

    public boolean a(Activity activity, Configuration configuration) {
        return false;
    }

    public boolean a(Context context, WebSettings webSettings) {
        kn.a(context, new ol(context, webSettings));
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public boolean a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public int b(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public ViewGroup.LayoutParams b() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public void b(Context context) {
    }

    public int c() {
        return 1;
    }

    public CookieManager c(Context context) {
        if (e()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            co.b("Failed to obtain CookieManager.", th);
            q.g().a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public long d() {
        return -1;
    }
}
