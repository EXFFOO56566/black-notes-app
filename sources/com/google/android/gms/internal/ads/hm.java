package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

public final class hm {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2939a = new Object();
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private String f2940b = BuildConfig.FLAVOR;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private String f2941c = BuildConfig.FLAVOR;
    @GuardedBy("lock")
    private boolean d = false;
    private String e = BuildConfig.FLAVOR;

    private final String a(Context context) {
        String str;
        synchronized (this.f2939a) {
            if (TextUtils.isEmpty(this.f2940b)) {
                q.c();
                String c2 = gl.c(context, "debug_signals_id.txt");
                this.f2940b = c2;
                if (TextUtils.isEmpty(c2)) {
                    q.c();
                    this.f2940b = gl.b();
                    q.c();
                    gl.b(context, "debug_signals_id.txt", this.f2940b);
                }
            }
            str = this.f2940b;
        }
        return str;
    }

    private final void a(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            co.c("Can not create dialog without Activity Context");
        } else {
            gl.h.post(new fm(this, context, str, z, z2));
        }
    }

    private final boolean b(Context context, String str, String str2) {
        String d2 = d(context, d(context, (String) on2.e().a(zr2.X1), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            co.a("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(d2.trim());
            String optString = jSONObject.optString("gct");
            this.e = jSONObject.optString("status");
            synchronized (this.f2939a) {
                this.f2941c = optString;
            }
            return true;
        } catch (JSONException e2) {
            co.c("Fail to get in app preview response json.", e2);
            return false;
        }
    }

    private final void c(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = d(context, (String) on2.e().a(zr2.Z1), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        q.c();
        gl.a(context, str, buildUpon.build().toString());
    }

    private final boolean c(Context context, String str, String str2) {
        String d2 = d(context, d(context, (String) on2.e().a(zr2.Y1), str, str2).toString(), str2);
        if (TextUtils.isEmpty(d2)) {
            co.a("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(d2.trim()).optString("debug_mode"));
            synchronized (this.f2939a) {
                this.d = equals;
            }
            return equals;
        } catch (JSONException e2) {
            co.c("Fail to get debug mode response json.", e2);
            return false;
        }
    }

    private final Uri d(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("linkedDeviceId", a(context));
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    private static String d(Context context, String str, String str2) {
        String str3;
        Throwable e2;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", q.c().a(context, str2));
        lo1<String> a2 = new tm(context).a(str, hashMap);
        try {
            return a2.get((long) ((Integer) on2.e().a(zr2.a2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e3) {
            e2 = e3;
            str5 = "Timeout while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                co.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            co.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (InterruptedException e4) {
            e2 = e4;
            str5 = "Interrupted while retriving a response from: ";
            str4 = String.valueOf(str);
            if (str4.length() == 0) {
                str3 = new String(str5);
                co.b(str3, e2);
                a2.cancel(true);
                return null;
            }
            str3 = str5.concat(str4);
            co.b(str3, e2);
            a2.cancel(true);
            return null;
        } catch (Exception e5) {
            String valueOf = String.valueOf(str);
            co.b(valueOf.length() != 0 ? "Error retriving a response from: ".concat(valueOf) : new String("Error retriving a response from: "), e5);
            return null;
        }
    }

    private final void e(Context context, String str, String str2) {
        q.c();
        gl.a(context, d(context, (String) on2.e().a(zr2.W1), str, str2));
    }

    public final String a() {
        String str;
        synchronized (this.f2939a) {
            str = this.f2941c;
        }
        return str;
    }

    public final void a(Context context, String str, String str2) {
        if (!b(context, str, str2)) {
            a(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
        } else if ("2".equals(this.e)) {
            co.a("Creative is not pushed for this device.");
            a(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.e)) {
            co.a("The app is not linked for creative preview.");
            e(context, str, str2);
        } else if ("0".equals(this.e)) {
            co.a("Device is linked for in app preview.");
            a(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void a(Context context, String str, String str2, String str3) {
        boolean b2 = b();
        if (c(context, str, str2)) {
            if (!b2 && !TextUtils.isEmpty(str3)) {
                c(context, str2, str3, str);
            }
            co.a("Device is linked for debug signals.");
            a(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        e(context, str, str2);
    }

    public final boolean b() {
        boolean z;
        synchronized (this.f2939a) {
            z = this.d;
        }
        return z;
    }

    public final boolean b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !q.m().b()) {
            return false;
        }
        co.a("Sending troubleshooting signals to the server.");
        c(context, str, str2, str3);
        return true;
    }
}
