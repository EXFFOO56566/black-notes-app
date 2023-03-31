package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import b.c.b.a.c.f;
import b.c.b.a.c.q.c;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.l;
import com.google.android.gms.internal.ads.p32;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class mi implements vi {
    private static List<Future<Void>> n = Collections.synchronizedList(new ArrayList());
    @GuardedBy("lock")

    /* renamed from: a  reason: collision with root package name */
    private final p32.b f3712a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    private final LinkedHashMap<String, p32.h.b> f3713b;
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f3714c = new ArrayList();
    @GuardedBy("lock")
    private final List<String> d = new ArrayList();
    private final Context e;
    private final xi f;
    private boolean g;
    private final ui h;
    private final aj i;
    private final Object j = new Object();
    private HashSet<String> k = new HashSet<>();
    private boolean l = false;
    private boolean m = false;

    public mi(Context context, fo foVar, ui uiVar, String str, xi xiVar) {
        r.a(uiVar, "SafeBrowsing config is not present.");
        this.e = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f3713b = new LinkedHashMap<>();
        this.f = xiVar;
        this.h = uiVar;
        for (String str2 : uiVar.f) {
            this.k.add(str2.toLowerCase(Locale.ENGLISH));
        }
        this.k.remove("cookie".toLowerCase(Locale.ENGLISH));
        p32.b t = p32.t();
        t.a(p32.g.OCTAGON_AD);
        t.a(str);
        t.b(str);
        p32.a.C0078a p = p32.a.p();
        String str3 = this.h.f4956b;
        if (str3 != null) {
            p.a(str3);
        }
        t.a((p32.a) ((rz1) p.e()));
        p32.i.a p2 = p32.i.p();
        p2.a(c.a(this.e).a());
        String str4 = foVar.f2633b;
        if (str4 != null) {
            p2.a(str4);
        }
        long a2 = (long) f.a().a(this.e);
        if (a2 > 0) {
            p2.a(a2);
        }
        t.a((p32.i) ((rz1) p2.e()));
        this.f3712a = t;
        this.i = new aj(this.e, this.h.i, this);
    }

    private final p32.h.b d(String str) {
        p32.h.b bVar;
        synchronized (this.j) {
            bVar = this.f3713b.get(str);
        }
        return bVar;
    }

    private final lo1<Void> e() {
        lo1<Void> a2;
        if (!((this.g && this.h.h) || (this.m && this.h.g) || (!this.g && this.h.e))) {
            return yn1.a((Object) null);
        }
        synchronized (this.j) {
            for (p32.h.b bVar : this.f3713b.values()) {
                this.f3712a.a((p32.h) ((rz1) bVar.e()));
            }
            this.f3712a.a(this.f3714c);
            this.f3712a.b(this.d);
            if (wi.a()) {
                String m2 = this.f3712a.m();
                String o = this.f3712a.o();
                StringBuilder sb = new StringBuilder(String.valueOf(m2).length() + 53 + String.valueOf(o).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(m2);
                sb.append("\n  clickUrl: ");
                sb.append(o);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (p32.h hVar : this.f3712a.n()) {
                    sb2.append("    [");
                    sb2.append(hVar.q());
                    sb2.append("] ");
                    sb2.append(hVar.p());
                }
                wi.a(sb2.toString());
            }
            lo1<String> a3 = new tm(this.e).a(1, this.h.f4957c, null, ((p32) ((rz1) this.f3712a.e())).f());
            if (wi.a()) {
                a3.a(ni.f3850b, jo.f3256a);
            }
            a2 = yn1.a(a3, qi.f4337a, jo.f);
        }
        return a2;
    }

    static final /* synthetic */ Void e(String str) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ lo1 a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.j) {
                            int length = optJSONArray.length();
                            p32.h.b d2 = d(str);
                            if (d2 == null) {
                                String valueOf = String.valueOf(str);
                                wi.a(valueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(valueOf) : new String("Cannot find the corresponding resource object for "));
                            } else {
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    d2.b(optJSONArray.getJSONObject(i2).getString("threat_type"));
                                }
                                boolean z2 = this.g;
                                if (length > 0) {
                                    z = true;
                                }
                                this.g = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException e2) {
                if (t0.f4732a.a().booleanValue()) {
                    co.a("Failed to get SafeBrowsing metadata", e2);
                }
                return yn1.a((Throwable) new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.g) {
            synchronized (this.j) {
                this.f3712a.a(p32.g.OCTAGON_AD_SB_MATCH);
            }
        }
        return e();
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Bitmap bitmap) {
        ry1 m2 = dy1.m();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, m2);
        synchronized (this.j) {
            p32.b bVar = this.f3712a;
            p32.f.b p = p32.f.p();
            p.a(m2.a());
            p.a("image/png");
            p.a(p32.f.a.TYPE_CREATIVE);
            bVar.a((p32.f) ((rz1) p.e()));
        }
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void a(View view) {
        if (this.h.d && !this.l) {
            q.c();
            Bitmap b2 = gl.b(view);
            if (b2 == null) {
                wi.a("Failed to capture the webview bitmap.");
                return;
            }
            this.l = true;
            gl.a(new li(this, b2));
        }
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void a(String str) {
        synchronized (this.j) {
            if (str == null) {
                this.f3712a.p();
            } else {
                this.f3712a.c(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void a(String str, Map<String, String> map, int i2) {
        synchronized (this.j) {
            if (i2 == 3) {
                this.m = true;
            }
            if (this.f3713b.containsKey(str)) {
                if (i2 == 3) {
                    this.f3713b.get(str).a(p32.h.a.a(i2));
                }
                return;
            }
            p32.h.b r = p32.h.r();
            p32.h.a a2 = p32.h.a.a(i2);
            if (a2 != null) {
                r.a(a2);
            }
            r.a(this.f3713b.size());
            r.a(str);
            p32.d.b p = p32.d.p();
            if (this.k.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : BuildConfig.FLAVOR;
                    String value = entry.getValue() != null ? entry.getValue() : BuildConfig.FLAVOR;
                    if (this.k.contains(key.toLowerCase(Locale.ENGLISH))) {
                        p32.c.a p2 = p32.c.p();
                        p2.a(dy1.a(key));
                        p2.b(dy1.a(value));
                        p.a((p32.c) ((rz1) p2.e()));
                    }
                }
            }
            r.a((p32.d) ((rz1) p.e()));
            this.f3713b.put(str, r);
        }
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final String[] a(String[] strArr) {
        return (String[]) this.i.a(strArr).toArray(new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final void b() {
        synchronized (this.j) {
            lo1 a2 = yn1.a(this.f.a(this.e, this.f3713b.keySet()), new oi(this), jo.f);
            lo1 a3 = yn1.a(a2, 10, TimeUnit.SECONDS, jo.d);
            yn1.a(a2, new pi(this, a3), jo.f);
            n.add(a3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        synchronized (this.j) {
            this.f3714c.add(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(String str) {
        synchronized (this.j) {
            this.d.add(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final boolean c() {
        return l.f() && this.h.d && !this.l;
    }

    @Override // com.google.android.gms.internal.ads.vi
    public final ui d() {
        return this.h;
    }
}
