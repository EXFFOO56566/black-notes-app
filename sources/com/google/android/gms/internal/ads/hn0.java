package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.q;
import java.util.regex.Pattern;

public final class hn0 implements z50, n60, t80 {

    /* renamed from: b  reason: collision with root package name */
    private final Context f2947b;

    /* renamed from: c  reason: collision with root package name */
    private final he1 f2948c;
    private final tn0 d;
    private final vd1 e;
    private final id1 f;
    private Boolean g;
    private final boolean h = ((Boolean) on2.e().a(zr2.B3)).booleanValue();

    public hn0(Context context, he1 he1, tn0 tn0, vd1 vd1, id1 id1) {
        this.f2947b = context;
        this.f2948c = he1;
        this.d = tn0;
        this.e = vd1;
        this.f = id1;
    }

    private final sn0 a(String str) {
        sn0 a2 = this.d.a();
        a2.a(this.e.f5093b.f4642b);
        a2.a(this.f);
        a2.a("action", str);
        if (!this.f.q.isEmpty()) {
            a2.a("ancn", this.f.q.get(0));
        }
        return a2;
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                q.g().a(e2, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final boolean c() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    kr2<String> kr2 = zr2.L0;
                    q.c();
                    this.g = Boolean.valueOf(a((String) on2.e().a(kr2), gl.o(this.f2947b)));
                }
            }
        }
        return this.g.booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.n60
    public final void K() {
        if (c()) {
            a("impression").a();
        }
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void O() {
        if (this.h) {
            sn0 a2 = a("ifts");
            a2.a("reason", "blocked");
            a2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void a() {
        if (c()) {
            a("adapter_impression").a();
        }
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void a(int i, String str) {
        if (this.h) {
            sn0 a2 = a("ifts");
            a2.a("reason", "adapter");
            if (i >= 0) {
                a2.a("arec", String.valueOf(i));
            }
            String a3 = this.f2948c.a(str);
            if (a3 != null) {
                a2.a("areec", a3);
            }
            a2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.z50
    public final void a(hd0 hd0) {
        if (this.h) {
            sn0 a2 = a("ifts");
            a2.a("reason", "exception");
            if (!TextUtils.isEmpty(hd0.getMessage())) {
                a2.a("msg", hd0.getMessage());
            }
            a2.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.t80
    public final void b() {
        if (c()) {
            a("adapter_shown").a();
        }
    }
}
