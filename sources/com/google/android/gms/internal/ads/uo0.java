package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class uo0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f4981a = false;

    /* renamed from: b  reason: collision with root package name */
    private boolean f4982b = false;

    /* renamed from: c  reason: collision with root package name */
    private final long f4983c;
    private final ro<Boolean> d = new ro<>();
    private final Context e;
    private final WeakReference<Context> f;
    private final rl0 g;
    private final Executor h;
    private final Executor i;
    private final ScheduledExecutorService j;
    private final eo0 k;
    private final fo l;
    private Map<String, e6> m = new ConcurrentHashMap();

    public uo0(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, rl0 rl0, ScheduledExecutorService scheduledExecutorService, eo0 eo0, fo foVar) {
        this.g = rl0;
        this.e = context;
        this.f = weakReference;
        this.h = executor2;
        this.j = scheduledExecutorService;
        this.i = executor;
        this.k = eo0;
        this.l = foVar;
        this.f4983c = q.j().b();
        a("com.google.android.gms.ads.MobileAds", false, BuildConfig.FLAVOR, 0);
    }

    /* access modifiers changed from: private */
    public final void a(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            for (Iterator<String> keys = jSONObject.keys(); keys.hasNext(); keys = keys) {
                String next = keys.next();
                Object obj = new Object();
                ro roVar = new ro();
                lo1 a2 = yn1.a(roVar, ((Long) on2.e().a(zr2.O0)).longValue(), TimeUnit.SECONDS, this.j);
                this.k.a(next);
                long b2 = q.j().b();
                a2.a(new yo0(this, obj, roVar, next, b2), this.h);
                arrayList.add(a2);
                ep0 ep0 = new ep0(this, obj, next, b2, roVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            String optString = jSONObject2.optString("format", BuildConfig.FLAVOR);
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, BuildConfig.FLAVOR));
                                }
                            }
                            arrayList2.add(new o6(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                a(next, false, BuildConfig.FLAVOR, 0);
                try {
                    this.i.execute(new ap0(this, this.g.a(next, new JSONObject()), ep0, arrayList2, next));
                } catch (fe1 unused2) {
                    try {
                        ep0.m("Failed to create Adapter.");
                    } catch (RemoteException e2) {
                        co.b(BuildConfig.FLAVOR, e2);
                    }
                }
            }
            yn1.b(arrayList).a(new bp0(this), this.h);
        } catch (JSONException e3) {
            wk.e("Malformed CLD response", e3);
        }
    }

    /* access modifiers changed from: private */
    public final void a(String str, boolean z, String str2, int i2) {
        this.m.put(str, new e6(str, z, i2, str2));
    }

    private final synchronized lo1<String> f() {
        String c2 = q.g().i().i().c();
        if (!TextUtils.isEmpty(c2)) {
            return yn1.a(c2);
        }
        ro roVar = new ro();
        q.g().i().a(new wo0(this, roVar));
        return roVar;
    }

    public final void a() {
        if (((Boolean) on2.e().a(zr2.M0)).booleanValue() && !s0.f4580a.a().booleanValue()) {
            if (this.l.d >= ((Integer) on2.e().a(zr2.N0)).intValue()) {
                if (!this.f4981a) {
                    synchronized (this) {
                        if (!this.f4981a) {
                            this.k.a();
                            this.d.a(new xo0(this), this.h);
                            this.f4981a = true;
                            lo1<String> f2 = f();
                            this.j.schedule(new zo0(this), ((Long) on2.e().a(zr2.P0)).longValue(), TimeUnit.SECONDS);
                            yn1.a(f2, new cp0(this), this.h);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
        a("com.google.android.gms.ads.MobileAds", true, BuildConfig.FLAVOR, 0);
        this.d.b(false);
    }

    public final void a(l6 l6Var) {
        this.d.a(new to0(this, l6Var), this.i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        com.google.android.gms.internal.ads.co.b(com.github.ajalt.reprint.module.spass.BuildConfig.FLAVOR, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 74);
        r4.append("Failed to initialize adapter. ");
        r4.append(r5);
        r4.append(" does not implement the initialize() method.");
        r3.m(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(com.google.android.gms.internal.ads.le1 r2, com.google.android.gms.internal.ads.g6 r3, java.util.List r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r1.f     // Catch:{ fe1 -> 0x0011 }
            java.lang.Object r0 = r0.get()     // Catch:{ fe1 -> 0x0011 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ fe1 -> 0x0011 }
            if (r0 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            android.content.Context r0 = r1.e     // Catch:{ fe1 -> 0x0011 }
        L_0x000d:
            r2.a(r0, r3, r4)     // Catch:{ fe1 -> 0x0011 }
            return
        L_0x0011:
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2.length()     // Catch:{ RemoteException -> 0x0035 }
            int r2 = r2 + 74
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0035 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = "Failed to initialize adapter. "
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            r4.append(r5)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = " does not implement the initialize() method."
            r4.append(r2)     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r2 = r4.toString()     // Catch:{ RemoteException -> 0x0035 }
            r3.m(r2)     // Catch:{ RemoteException -> 0x0035 }
            return
        L_0x0035:
            r2 = move-exception
            java.lang.String r3 = ""
            com.google.android.gms.internal.ads.co.b(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uo0.a(com.google.android.gms.internal.ads.le1, com.google.android.gms.internal.ads.g6, java.util.List, java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ro roVar) {
        this.h.execute(new dp0(this, roVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Object obj, ro roVar, String str, long j2) {
        synchronized (obj) {
            if (!roVar.isDone()) {
                a(str, false, "Timeout.", (int) (q.j().b() - j2));
                this.k.a(str, "timeout");
                roVar.b(false);
            }
        }
    }

    public final List<e6> b() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.m.keySet()) {
            e6 e6Var = this.m.get(str);
            arrayList.add(new e6(str, e6Var.f2372c, e6Var.d, e6Var.e));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(l6 l6Var) {
        try {
            l6Var.a(b());
        } catch (RemoteException e2) {
            co.b(BuildConfig.FLAVOR, e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c() {
        this.d.b(true);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        synchronized (this) {
            if (!this.f4982b) {
                a("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (q.j().b() - this.f4983c));
                this.d.a(new Exception());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        this.k.b();
    }
}
