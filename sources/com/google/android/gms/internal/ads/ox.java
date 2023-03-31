package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import b.c.b.a.d.a;
import b.c.b.a.d.b;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import com.google.android.gms.ads.internal.q;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

public final class ox extends uo2 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f4060b;

    /* renamed from: c  reason: collision with root package name */
    private final fo f4061c;
    private final rl0 d;
    private final kt0<le1, tu0> e;
    private final ez0 f;
    private final uo0 g;
    private final cj h;
    private final ul0 i;
    @GuardedBy("this")
    private boolean j = false;

    ox(Context context, fo foVar, rl0 rl0, kt0<le1, tu0> kt0, ez0 ez0, uo0 uo0, cj cjVar, ul0 ul0) {
        this.f4060b = context;
        this.f4061c = foVar;
        this.d = rl0;
        this.e = kt0;
        this.f = ez0;
        this.g = uo0;
        this.h = cjVar;
        this.i = ul0;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final synchronized void L() {
        if (this.j) {
            co.d("Mobile ads is initialized already.");
            return;
        }
        zr2.a(this.f4060b);
        q.g().a(this.f4060b, this.f4061c);
        q.i().a(this.f4060b);
        this.j = true;
        this.g.a();
        if (((Boolean) on2.e().a(zr2.J0)).booleanValue()) {
            this.f.a();
        }
        if (((Boolean) on2.e().a(zr2.E1)).booleanValue()) {
            this.i.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final synchronized boolean N0() {
        return q.h().b();
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final List<e6> V1() {
        return this.g.b();
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final String W1() {
        return this.f4061c.f2633b;
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final synchronized void a(float f2) {
        q.h().a(f2);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(a aVar, String str) {
        if (aVar == null) {
            co.b("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) b.Q(aVar);
        if (context == null) {
            co.b("Context is null. Failed to open debug menu.");
            return;
        }
        xl xlVar = new xl(context);
        xlVar.a(str);
        xlVar.b(this.f4061c.f2633b);
        xlVar.a();
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(l6 l6Var) {
        this.g.a(l6Var);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(ra raVar) {
        this.d.a(raVar);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void a(yq2 yq2) {
        this.h.a(this.f4060b, yq2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Runnable runnable) {
        r.a("Adapters must be initialized on the main thread.");
        Map<String, ma> e2 = q.g().i().i().e();
        if (!(e2 == null || e2.isEmpty())) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    co.c("Could not initialize rewarded ads.", th);
                    return;
                }
            }
            if (this.d.a()) {
                HashMap hashMap = new HashMap();
                for (ma maVar : e2.values()) {
                    for (na naVar : maVar.f3682a) {
                        String str = naVar.f3817b;
                        for (String str2 : naVar.f3816a) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((Collection) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        lt0<le1, tu0> a2 = this.e.a(str3, jSONObject);
                        if (a2 != null) {
                            AdapterT adaptert = a2.f3600b;
                            if (!adaptert.d()) {
                                if (adaptert.k()) {
                                    adaptert.a(this.f4060b, (tu0) a2.f3601c, (List) entry.getValue());
                                    String valueOf = String.valueOf(str3);
                                    co.a(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                                }
                            }
                        }
                    } catch (fe1 e3) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                        sb.append("Failed to initialize rewarded video mediation adapter \"");
                        sb.append(str3);
                        sb.append("\"");
                        co.c(sb.toString(), e3);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void b(String str, a aVar) {
        String str2;
        zr2.a(this.f4060b);
        if (((Boolean) on2.e().a(zr2.F1)).booleanValue()) {
            q.c();
            str2 = gl.o(this.f4060b);
        } else {
            str2 = BuildConfig.FLAVOR;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean booleanValue = ((Boolean) on2.e().a(zr2.D1)).booleanValue() | ((Boolean) on2.e().a(zr2.l0)).booleanValue();
            rx rxVar = null;
            if (((Boolean) on2.e().a(zr2.l0)).booleanValue()) {
                booleanValue = true;
                rxVar = new rx(this, (Runnable) b.Q(aVar));
            }
            if (booleanValue) {
                q.k().a(this.f4060b, this.f4061c, str, rxVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final synchronized void d(boolean z) {
        q.h().a(z);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final synchronized void h(String str) {
        zr2.a(this.f4060b);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) on2.e().a(zr2.D1)).booleanValue()) {
                q.k().a(this.f4060b, this.f4061c, str, (Runnable) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final void l(String str) {
        this.f.a(str);
    }

    @Override // com.google.android.gms.internal.ads.vo2
    public final synchronized float o1() {
        return q.h().a();
    }
}
