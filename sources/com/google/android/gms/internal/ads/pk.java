package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.q;
import javax.annotation.concurrent.GuardedBy;

public final class pk {

    /* renamed from: a  reason: collision with root package name */
    private long f4190a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f4191b = -1;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private int f4192c = -1;
    int d = -1;
    private long e = 0;
    private final Object f = new Object();
    private final String g;
    private final yk h;
    @GuardedBy("lock")
    private int i = 0;
    @GuardedBy("lock")
    private int j = 0;

    public pk(String str, yk ykVar) {
        this.g = str;
        this.h = ykVar;
    }

    private static boolean a(Context context) {
        Context a2 = vg.a(context);
        int identifier = a2.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            co.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == a2.getPackageManager().getActivityInfo(new ComponentName(a2.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            co.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            co.d("Fail to fetch AdActivity theme");
            co.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.g);
            bundle.putLong("basets", this.f4191b);
            bundle.putLong("currts", this.f4190a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f4192c);
            bundle.putInt("preqs_in_session", this.d);
            bundle.putLong("time_in_session", this.e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.f) {
            this.j++;
        }
    }

    public final void a(rm2 rm2, long j2) {
        synchronized (this.f) {
            long e2 = this.h.e();
            long a2 = q.j().a();
            if (this.f4191b == -1) {
                if (a2 - e2 > ((Long) on2.e().a(zr2.p0)).longValue()) {
                    this.d = -1;
                } else {
                    this.d = this.h.a();
                }
                this.f4191b = j2;
            }
            this.f4190a = j2;
            if (rm2 == null || rm2.d == null || rm2.d.getInt("gw", 2) != 1) {
                this.f4192c++;
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 == 0) {
                    this.e = 0;
                    this.h.b(a2);
                } else {
                    this.e = a2 - this.h.l();
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f) {
            this.i++;
        }
    }
}
