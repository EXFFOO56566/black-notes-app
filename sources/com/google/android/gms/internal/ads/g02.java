package com.google.android.gms.internal.ads;

public class g02 {

    /* renamed from: a  reason: collision with root package name */
    private volatile c12 f2683a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dy1 f2684b;

    static {
        dz1.a();
    }

    private final c12 b(c12 c12) {
        if (this.f2683a == null) {
            synchronized (this) {
                if (this.f2683a == null) {
                    try {
                        this.f2683a = c12;
                        this.f2684b = dy1.f2334c;
                    } catch (b02 unused) {
                        this.f2683a = c12;
                        this.f2684b = dy1.f2334c;
                    }
                }
            }
        }
        return this.f2683a;
    }

    public final c12 a(c12 c12) {
        c12 c122 = this.f2683a;
        this.f2684b = null;
        this.f2683a = c12;
        return c122;
    }

    public final dy1 a() {
        if (this.f2684b != null) {
            return this.f2684b;
        }
        synchronized (this) {
            if (this.f2684b != null) {
                return this.f2684b;
            }
            this.f2684b = this.f2683a == null ? dy1.f2334c : this.f2683a.d();
            return this.f2684b;
        }
    }

    public final int b() {
        if (this.f2684b != null) {
            return this.f2684b.size();
        }
        if (this.f2683a != null) {
            return this.f2683a.c();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g02)) {
            return false;
        }
        g02 g02 = (g02) obj;
        c12 c12 = this.f2683a;
        c12 c122 = g02.f2683a;
        return (c12 == null && c122 == null) ? a().equals(g02.a()) : (c12 == null || c122 == null) ? c12 != null ? c12.equals(g02.b(c12.h())) : b(c122.h()).equals(c122) : c12.equals(c122);
    }

    public int hashCode() {
        return 1;
    }
}
