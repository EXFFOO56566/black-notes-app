package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.q;
import com.google.android.gms.ads.s.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class tb implements t {

    /* renamed from: a  reason: collision with root package name */
    private final Date f4777a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4778b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<String> f4779c;
    private final boolean d;
    private final Location e;
    private final int f;
    private final m1 g;
    private final List<String> h = new ArrayList();
    private final boolean i;
    private final Map<String, Boolean> j = new HashMap();

    public tb(Date date, int i2, Set<String> set, Location location, boolean z, int i3, m1 m1Var, List<String> list, boolean z2, int i4, String str) {
        Map<String, Boolean> map;
        String str2;
        boolean z3;
        this.f4777a = date;
        this.f4778b = i2;
        this.f4779c = set;
        this.e = location;
        this.d = z;
        this.f = i3;
        this.g = m1Var;
        this.i = z2;
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith("custom:")) {
                    String[] split = str3.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            z3 = true;
                        } else if ("false".equals(split[2])) {
                            map = this.j;
                            str2 = split[1];
                            z3 = false;
                        }
                        map.put(str2, z3);
                    }
                } else {
                    this.h.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final boolean a() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final boolean b() {
        List<String> list = this.h;
        if (list != null) {
            return list.contains("2") || this.h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final Date c() {
        return this.f4777a;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final boolean d() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final Set<String> e() {
        return this.f4779c;
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final Map<String, Boolean> f() {
        return this.j;
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final d g() {
        er2 er2;
        if (this.g == null) {
            return null;
        }
        d.a aVar = new d.a();
        aVar.b(this.g.f3639c);
        aVar.b(this.g.d);
        aVar.a(this.g.e);
        m1 m1Var = this.g;
        if (m1Var.f3638b >= 2) {
            aVar.a(m1Var.f);
        }
        m1 m1Var2 = this.g;
        if (m1Var2.f3638b >= 3 && (er2 = m1Var2.g) != null) {
            aVar.a(new q(er2));
        }
        return aVar.a();
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final int h() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final boolean i() {
        List<String> list = this.h;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final boolean j() {
        List<String> list = this.h;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final Location k() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.t
    public final boolean l() {
        List<String> list = this.h;
        if (list != null) {
            return list.contains("1") || this.h.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.e
    @Deprecated
    public final int m() {
        return this.f4778b;
    }
}
