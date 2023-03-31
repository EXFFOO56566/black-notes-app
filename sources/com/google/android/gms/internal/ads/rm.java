package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.p;

public final class rm {

    /* renamed from: a  reason: collision with root package name */
    public final String f4517a;

    /* renamed from: b  reason: collision with root package name */
    private final double f4518b;

    /* renamed from: c  reason: collision with root package name */
    private final double f4519c;
    public final double d;
    public final int e;

    public rm(String str, double d2, double d3, double d4, int i) {
        this.f4517a = str;
        this.f4519c = d2;
        this.f4518b = d3;
        this.d = d4;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rm)) {
            return false;
        }
        rm rmVar = (rm) obj;
        return p.a(this.f4517a, rmVar.f4517a) && this.f4518b == rmVar.f4518b && this.f4519c == rmVar.f4519c && this.e == rmVar.e && Double.compare(this.d, rmVar.d) == 0;
    }

    public final int hashCode() {
        return p.a(this.f4517a, Double.valueOf(this.f4518b), Double.valueOf(this.f4519c), Double.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        p.a a2 = p.a(this);
        a2.a("name", this.f4517a);
        a2.a("minBound", Double.valueOf(this.f4519c));
        a2.a("maxBound", Double.valueOf(this.f4518b));
        a2.a("percent", Double.valueOf(this.d));
        a2.a("count", Integer.valueOf(this.e));
        return a2.toString();
    }
}
