package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.s.j;
import com.google.android.gms.common.internal.r;
import java.util.ArrayList;

public final class be1 {

    /* renamed from: a */
    private rm2 f1928a;

    /* renamed from: b */
    private um2 f1929b;

    /* renamed from: c */
    private to2 f1930c;
    private String d;
    private er2 e;
    private boolean f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private m1 i;
    private bn2 j;
    private j k;
    private no2 l;
    private int m = 1;
    private q6 n;
    private nd1 o = new nd1();
    private boolean p = false;

    public final be1 a(int i2) {
        this.m = i2;
        return this;
    }

    public final be1 a(j jVar) {
        this.k = jVar;
        if (jVar != null) {
            this.f = jVar.d();
            this.l = jVar.e();
        }
        return this;
    }

    public final be1 a(bn2 bn2) {
        this.j = bn2;
        return this;
    }

    public final be1 a(er2 er2) {
        this.e = er2;
        return this;
    }

    public final be1 a(m1 m1Var) {
        this.i = m1Var;
        return this;
    }

    public final be1 a(q6 q6Var) {
        this.n = q6Var;
        this.e = new er2(false, true, false);
        return this;
    }

    public final be1 a(rm2 rm2) {
        this.f1928a = rm2;
        return this;
    }

    public final be1 a(to2 to2) {
        this.f1930c = to2;
        return this;
    }

    public final be1 a(um2 um2) {
        this.f1929b = um2;
        return this;
    }

    public final be1 a(zd1 zd1) {
        this.o.a(zd1.n);
        this.f1928a = zd1.d;
        this.f1929b = zd1.e;
        this.f1930c = zd1.f5736a;
        this.d = zd1.f;
        this.e = zd1.f5737b;
        this.g = zd1.g;
        this.h = zd1.h;
        this.i = zd1.i;
        this.j = zd1.j;
        a(zd1.l);
        this.p = zd1.o;
        return this;
    }

    public final be1 a(String str) {
        this.d = str;
        return this;
    }

    public final be1 a(ArrayList<String> arrayList) {
        this.g = arrayList;
        return this;
    }

    public final be1 a(boolean z) {
        this.p = z;
        return this;
    }

    public final rm2 a() {
        return this.f1928a;
    }

    public final be1 b(ArrayList<String> arrayList) {
        this.h = arrayList;
        return this;
    }

    public final be1 b(boolean z) {
        this.f = z;
        return this;
    }

    public final String b() {
        return this.d;
    }

    public final nd1 c() {
        return this.o;
    }

    public final zd1 d() {
        r.a((Object) this.d, (Object) "ad unit must not be null");
        r.a(this.f1929b, "ad size must not be null");
        r.a(this.f1928a, "ad request must not be null");
        return new zd1(this);
    }

    public final um2 e() {
        return this.f1929b;
    }
}
