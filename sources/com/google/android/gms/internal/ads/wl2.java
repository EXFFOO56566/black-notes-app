package com.google.android.gms.internal.ads;

public enum wl2 implements tz1 {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f5293b;

    static {
        new vl2();
    }

    private wl2(int i) {
        this.f5293b = i;
    }

    public static wl2 a(int i) {
        if (i == 0) {
            return ENUM_FALSE;
        }
        if (i == 1) {
            return ENUM_TRUE;
        }
        if (i != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
    }

    public static vz1 b() {
        return xl2.f5441a;
    }

    @Override // com.google.android.gms.internal.ads.tz1
    public final int a() {
        return this.f5293b;
    }

    public final String toString() {
        return "<" + wl2.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f5293b + " name=" + name() + '>';
    }
}
