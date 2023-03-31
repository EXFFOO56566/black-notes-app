package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.util.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bl implements yk {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1966a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f1967b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Runnable> f1968c = new ArrayList();
    private lo1<?> d;
    @GuardedBy("lock")
    private wh2 e = null;
    @GuardedBy("lock")
    private SharedPreferences f;
    @GuardedBy("lock")
    private SharedPreferences.Editor g;
    @GuardedBy("lock")
    private boolean h = true;
    @GuardedBy("lock")
    private String i;
    @GuardedBy("lock")
    private String j;
    @GuardedBy("lock")
    private boolean k = false;
    @GuardedBy("lock")
    private String l = BuildConfig.FLAVOR;
    @GuardedBy("lock")
    private long m = 0;
    @GuardedBy("lock")
    private long n = 0;
    @GuardedBy("lock")
    private long o = 0;
    @GuardedBy("lock")
    private int p = -1;
    @GuardedBy("lock")
    private int q = 0;
    @GuardedBy("lock")
    private Set<String> r = Collections.emptySet();
    @GuardedBy("lock")
    private JSONObject s = new JSONObject();
    @GuardedBy("lock")
    private boolean t = true;
    @GuardedBy("lock")
    private boolean u = true;
    @GuardedBy("lock")
    private String v = null;
    @GuardedBy("lock")
    private int w = -1;

    private final void a(Bundle bundle) {
        jo.f3256a.execute(new dl(this));
    }

    private final void o() {
        lo1<?> lo1 = this.d;
        if (lo1 != null && !lo1.isDone()) {
            try {
                this.d.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                co.c("Interrupted while waiting for preferences loaded.", e2);
            } catch (CancellationException | ExecutionException | TimeoutException e3) {
                co.b("Fail to initialize AdSharedPreferenceManager.", e3);
            }
        }
    }

    private final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f1966a) {
            bundle.putBoolean("use_https", this.h);
            bundle.putBoolean("content_url_opted_out", this.t);
            bundle.putBoolean("content_vertical_opted_out", this.u);
            bundle.putBoolean("auto_collect_location", this.k);
            bundle.putInt("version_code", this.q);
            bundle.putStringArray("never_pool_slots", (String[]) this.r.toArray(new String[0]));
            bundle.putString("app_settings_json", this.l);
            bundle.putLong("app_settings_last_update_ms", this.m);
            bundle.putLong("app_last_background_time_ms", this.n);
            bundle.putInt("request_in_session_count", this.p);
            bundle.putLong("first_ad_req_time_ms", this.o);
            bundle.putString("native_advanced_settings", this.s.toString());
            bundle.putString("display_cutout", this.v);
            bundle.putInt("app_measurement_npa", this.w);
            if (this.i != null) {
                bundle.putString("content_url_hashes", this.i);
            }
            if (this.j != null) {
                bundle.putString("content_vertical_hashes", this.j);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final int a() {
        int i2;
        o();
        synchronized (this.f1966a) {
            i2 = this.p;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void a(int i2) {
        o();
        synchronized (this.f1966a) {
            if (this.q != i2) {
                this.q = i2;
                if (this.g != null) {
                    this.g.putInt("version_code", i2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("version_code", i2);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void a(long j2) {
        o();
        synchronized (this.f1966a) {
            if (this.n != j2) {
                this.n = j2;
                if (this.g != null) {
                    this.g.putLong("app_last_background_time_ms", j2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("app_last_background_time_ms", j2);
                a(bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.f1966a) {
            this.f = sharedPreferences;
            this.g = edit;
            if (l.i()) {
                NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            this.h = this.f.getBoolean("use_https", this.h);
            this.t = this.f.getBoolean("content_url_opted_out", this.t);
            this.i = this.f.getString("content_url_hashes", this.i);
            this.k = this.f.getBoolean("auto_collect_location", this.k);
            this.u = this.f.getBoolean("content_vertical_opted_out", this.u);
            this.j = this.f.getString("content_vertical_hashes", this.j);
            this.q = this.f.getInt("version_code", this.q);
            this.l = this.f.getString("app_settings_json", this.l);
            this.m = this.f.getLong("app_settings_last_update_ms", this.m);
            this.n = this.f.getLong("app_last_background_time_ms", this.n);
            this.p = this.f.getInt("request_in_session_count", this.p);
            this.o = this.f.getLong("first_ad_req_time_ms", this.o);
            this.r = this.f.getStringSet("never_pool_slots", this.r);
            this.v = this.f.getString("display_cutout", this.v);
            this.w = this.f.getInt("app_measurement_npa", this.w);
            try {
                this.s = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e2) {
                co.c("Could not convert native advanced settings to json object", e2);
            }
            a(p());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x000f, code lost:
        r4 = java.lang.String.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (r4.length() == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        r4 = "admob__".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r4 = new java.lang.String("admob__");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2.d = com.google.android.gms.internal.ads.jo.f3256a.a(new com.google.android.gms.internal.ads.al(r2, r3, r4));
        r2.f1967b = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r4 != null) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r4 = "admob";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f1966a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r2.f     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x000f
            java.lang.String r4 = "admob"
            goto L_0x0025
        L_0x000f:
            java.lang.String r0 = "admob__"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r1 = r4.length()
            if (r1 == 0) goto L_0x0020
            java.lang.String r4 = r0.concat(r4)
            goto L_0x0025
        L_0x0020:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r0)
        L_0x0025:
            com.google.android.gms.internal.ads.ko1 r0 = com.google.android.gms.internal.ads.jo.f3256a
            com.google.android.gms.internal.ads.al r1 = new com.google.android.gms.internal.ads.al
            r1.<init>(r2, r3, r4)
            com.google.android.gms.internal.ads.lo1 r3 = r0.a(r1)
            r2.d = r3
            r2.f1967b = r5
            return
        L_0x0035:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bl.a(android.content.Context, java.lang.String, boolean):void");
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void a(Runnable runnable) {
        this.f1968c.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void a(String str) {
        o();
        synchronized (this.f1966a) {
            if (str != null) {
                if (!str.equals(this.i)) {
                    this.i = str;
                    if (this.g != null) {
                        this.g.putString("content_url_hashes", str);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    a(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void a(String str, String str2, boolean z) {
        o();
        synchronized (this.f1966a) {
            JSONArray optJSONArray = this.s.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i2 = 0;
            while (true) {
                if (i2 < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i2++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", q.j().a());
                optJSONArray.put(length, jSONObject);
                this.s.put(str, optJSONArray);
            } catch (JSONException e2) {
                co.c("Could not update native advanced settings", e2);
            }
            if (this.g != null) {
                this.g.putString("native_advanced_settings", this.s.toString());
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.s.toString());
            a(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void a(boolean z) {
        o();
        synchronized (this.f1966a) {
            if (this.u != z) {
                this.u = z;
                if (this.g != null) {
                    this.g.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.t);
                bundle.putBoolean("content_vertical_opted_out", this.u);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void b(int i2) {
        o();
        synchronized (this.f1966a) {
            if (this.p != i2) {
                this.p = i2;
                if (this.g != null) {
                    this.g.putInt("request_in_session_count", i2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putInt("request_in_session_count", i2);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void b(long j2) {
        o();
        synchronized (this.f1966a) {
            if (this.o != j2) {
                this.o = j2;
                if (this.g != null) {
                    this.g.putLong("first_ad_req_time_ms", j2);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putLong("first_ad_req_time_ms", j2);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void b(String str) {
        o();
        synchronized (this.f1966a) {
            if (str != null) {
                if (!str.equals(this.j)) {
                    this.j = str;
                    if (this.g != null) {
                        this.g.putString("content_vertical_hashes", str);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    a(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void b(boolean z) {
        o();
        synchronized (this.f1966a) {
            if (this.k != z) {
                this.k = z;
                if (this.g != null) {
                    this.g.putBoolean("auto_collect_location", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("auto_collect_location", z);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final boolean b() {
        boolean z;
        o();
        synchronized (this.f1966a) {
            z = this.k;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final String c() {
        String str;
        o();
        synchronized (this.f1966a) {
            str = this.v;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void c(String str) {
        o();
        synchronized (this.f1966a) {
            long a2 = q.j().a();
            this.m = a2;
            if (str != null) {
                if (!str.equals(this.l)) {
                    this.l = str;
                    if (this.g != null) {
                        this.g.putString("app_settings_json", str);
                        this.g.putLong("app_settings_last_update_ms", a2);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("app_settings_json", str);
                    bundle.putLong("app_settings_last_update_ms", a2);
                    a(bundle);
                    for (Runnable runnable : this.f1968c) {
                        runnable.run();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void c(boolean z) {
        o();
        synchronized (this.f1966a) {
            if (this.t != z) {
                this.t = z;
                if (this.g != null) {
                    this.g.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("content_url_opted_out", this.t);
                bundle.putBoolean("content_vertical_opted_out", this.u);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void d(String str) {
        o();
        synchronized (this.f1966a) {
            if (!TextUtils.equals(this.v, str)) {
                this.v = str;
                if (this.g != null) {
                    this.g.putString("display_cutout", str);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("display_cutout", str);
                a(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final boolean d() {
        boolean z;
        o();
        synchronized (this.f1966a) {
            z = this.t;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final long e() {
        long j2;
        o();
        synchronized (this.f1966a) {
            j2 = this.n;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final String f() {
        String str;
        o();
        synchronized (this.f1966a) {
            str = this.j;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final void g() {
        o();
        synchronized (this.f1966a) {
            this.s = new JSONObject();
            if (this.g != null) {
                this.g.remove("native_advanced_settings");
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            a(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final wh2 h() {
        if (!this.f1967b) {
            return null;
        }
        if ((d() && j()) || !k0.f3301b.a().booleanValue()) {
            return null;
        }
        synchronized (this.f1966a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.e == null) {
                this.e = new wh2();
            }
            this.e.b();
            co.c("start fetching content...");
            return this.e;
        }
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final jk i() {
        jk jkVar;
        o();
        synchronized (this.f1966a) {
            jkVar = new jk(this.l, this.m);
        }
        return jkVar;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final boolean j() {
        boolean z;
        o();
        synchronized (this.f1966a) {
            z = this.u;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final JSONObject k() {
        JSONObject jSONObject;
        o();
        synchronized (this.f1966a) {
            jSONObject = this.s;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final long l() {
        long j2;
        o();
        synchronized (this.f1966a) {
            j2 = this.o;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final int m() {
        int i2;
        o();
        synchronized (this.f1966a) {
            i2 = this.q;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.yk
    public final String n() {
        String str;
        o();
        synchronized (this.f1966a) {
            str = this.i;
        }
        return str;
    }
}
