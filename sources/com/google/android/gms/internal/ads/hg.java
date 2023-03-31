package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import b.c.b.a.c.q.c;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.l;
import java.util.Locale;

public final class hg {
    private int A;
    private String B;
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    private int f2911a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2912b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f2913c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private final boolean u;
    private boolean v;
    private String w;
    private String x;
    private float y;
    private int z;

    public hg(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        a(context);
        b(context);
        c(context);
        Locale locale = Locale.getDefault();
        boolean z2 = true;
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") == null ? false : z2;
        this.s = locale.getCountry();
        on2.a();
        this.t = sn.a();
        this.u = h.a(context);
        this.v = h.b(context);
        this.w = locale.getLanguage();
        this.x = a(context, packageManager);
        this.B = d(context);
        Resources resources = context.getResources();
        if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            this.y = displayMetrics.density;
            this.z = displayMetrics.widthPixels;
            this.A = displayMetrics.heightPixels;
        }
    }

    public hg(Context context, ig igVar) {
        a(context);
        b(context);
        c(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = l.b() && y.a(context);
        this.q = igVar.f3076a;
        this.r = igVar.f3077b;
        this.s = igVar.f3078c;
        this.t = igVar.d;
        this.u = igVar.e;
        this.v = igVar.f;
        this.w = igVar.g;
        this.x = igVar.h;
        this.B = igVar.i;
        this.y = igVar.l;
        this.z = igVar.m;
        this.A = igVar.n;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            q.g().a(th, "DeviceInfo.getResolveInfo");
            return null;
        }
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
                int i2 = b2.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private final void a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f2911a = audioManager.getMode();
                this.f2912b = audioManager.isMusicActive();
                this.f2913c = audioManager.isSpeakerphoneOn();
                this.d = audioManager.getStreamVolume(3);
                this.e = audioManager.getRingerMode();
                this.f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                q.g().a(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f2911a = -2;
        this.f2912b = false;
        this.f2913c = false;
        this.d = 0;
        this.e = 2;
        this.f = 0;
    }

    @TargetApi(16)
    private final void b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = telephonyManager.getNetworkOperator();
        this.i = telephonyManager.getNetworkType();
        this.j = telephonyManager.getPhoneType();
        this.h = -2;
        this.k = false;
        this.l = -1;
        q.c();
        if (gl.b(context, "android.permission.ACCESS_NETWORK_STATE")) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.h = activeNetworkInfo.getType();
                this.l = activeNetworkInfo.getDetailedState().ordinal();
            } else {
                this.h = -1;
            }
            this.k = connectivityManager.isActiveNetworkMetered();
        }
    }

    private final void c(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z2 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
            if (intExtra == 2 || intExtra == 5) {
                z2 = true;
            }
            this.n = z2;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    private static String d(Context context) {
        try {
            PackageInfo b2 = c.a(context).b("com.android.vending", 128);
            if (b2 != null) {
                int i2 = b2.versionCode;
                String str = b2.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(i2);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final ig a() {
        return new ig(this.f2911a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.f2912b, this.f2913c, this.w, this.x, this.B, this.d, this.h, this.i, this.j, this.e, this.f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
    }
}
